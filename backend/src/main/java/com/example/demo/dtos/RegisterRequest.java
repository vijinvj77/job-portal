package com.example.demo.dtos;

import com.example.demo.constants.AuthConstants;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
	
	@NotBlank(message = AuthConstants.NAME_REQUIRED)
	private String name;
	
	@NotBlank(message = AuthConstants.EMAIL_REQUIRED)
	@Email(message = AuthConstants.EMAIL_INVALID)
	private String email;
	
	@NotBlank(message = AuthConstants.PASSWORD_REQUIRED)
	@Size(min = 6, message = AuthConstants.PASSWORD_MIN_LENGTH)
	private String password;
}
