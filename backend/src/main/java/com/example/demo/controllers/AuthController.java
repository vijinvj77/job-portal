package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.ApiResponse;
import com.example.demo.dtos.AuthData;
import com.example.demo.dtos.LoginRequest;
import com.example.demo.dtos.RegisterRequest;
import com.example.demo.services.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
	
	private final AuthService authService;
	
	@PostMapping("/register")
	public ResponseEntity<ApiResponse<AuthData>> register(
			@Valid @RequestBody RegisterRequest request) {
		
		ApiResponse<AuthData> response = authService.register(request);
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}
	
	@PostMapping("/login")
	public ResponseEntity<ApiResponse<AuthData>> login(
			@Valid @RequestBody LoginRequest request) {
		
		ApiResponse<AuthData> response = authService.login(request);
		return ResponseEntity.status(response.getStatusCode()).body(response);
	}

	@PostMapping("/logout")
	public ResponseEntity<String> logout() {
		// TODO: Implement logout logic with JWT token invalidation
		return ResponseEntity.ok("Logged out");
	}
}
