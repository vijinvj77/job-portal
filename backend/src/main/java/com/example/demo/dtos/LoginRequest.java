package com.example.demo.dtos;

import com.example.demo.constants.AuthConstants;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
	
	@NotBlank(message = AuthConstants.EMAIL_REQUIRED)
	@Email(message = AuthConstants.EMAIL_INVALID)
	private String email;
	
	@NotBlank(message = AuthConstants.PASSWORD_REQUIRED)
	private String password;
}
