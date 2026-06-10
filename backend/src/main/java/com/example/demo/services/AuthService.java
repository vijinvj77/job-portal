package com.example.demo.services;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.constants.AuthConstants;
import com.example.demo.dtos.ApiResponse;
import com.example.demo.dtos.AuthData;
import com.example.demo.dtos.ErrorResponse;
import com.example.demo.dtos.LoginRequest;
import com.example.demo.dtos.RegisterRequest;
import com.example.demo.dtos.SuccessResponse;
import com.example.demo.entities.User;
import com.example.demo.enums.Role;
import com.example.demo.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	public ApiResponse<AuthData> register(RegisterRequest request) {
		
		if(userRepository.existsByEmail(request.getEmail())) {
			return new ErrorResponse<>(
					400,
					HttpStatus.BAD_REQUEST,
					AuthConstants.EMAIL_ALREADY_EXISTS,
					null
			);
		}
		
		User user = User.builder()
				.name(request.getName())
				.email(request.getEmail())
				.password(passwordEncoder.encode(request.getPassword()))
				.role(Role.USER)
				.enabled(true)
				.createdAt(LocalDateTime.now())
				.build();
		
		userRepository.save(user);
		
		AuthData authData = AuthData.builder()
				.token(null)
				.email(user.getEmail())
				.role(user.getRole().name())
				.build();
		
		return new SuccessResponse<>(
				201,
				HttpStatus.CREATED,
				AuthConstants.REGISTRATION_SUCCESS,
				authData
		);
	}

	public ApiResponse<AuthData> login(LoginRequest request) {
		
		User user = userRepository.findByEmail(request.getEmail())
				.orElse(null);
		
		if(user == null) {
			return new ErrorResponse<>(
					401,
					HttpStatus.UNAUTHORIZED,
					AuthConstants.INVALID_CREDENTIALS,
					null
			);
		}
		
		if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
			return new ErrorResponse<>(
					401,
					HttpStatus.UNAUTHORIZED,
					AuthConstants.INVALID_CREDENTIALS,
					null
			);
		}
		
		// TODO: Generate JWT token here
		String token = "temporary-token-" + user.getEmail();
		
		AuthData authData = AuthData.builder()
				.token(token)
				.email(user.getEmail())
				.role(user.getRole().name())
				.build();
		
		return new SuccessResponse<>(
				200,
				HttpStatus.OK,
				AuthConstants.LOGIN_SUCCESS,
				authData
		);
	}
}
