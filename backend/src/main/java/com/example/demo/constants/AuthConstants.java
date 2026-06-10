package com.example.demo.constants;

public final class AuthConstants {
	
	// Private constructor to prevent instantiation
	private AuthConstants() {
		throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
	}
	
	// Error Messages
	public static final String EMAIL_ALREADY_EXISTS = "Email already exists";
	public static final String INVALID_CREDENTIALS = "Invalid email or password";
	
	// Success Messages
	public static final String REGISTRATION_SUCCESS = "User registered successfully";
	public static final String LOGIN_SUCCESS = "Login successful";
	
	// Validation Messages
	public static final String EMAIL_REQUIRED = "Email is required";
	public static final String EMAIL_INVALID = "Email must be valid";
	public static final String PASSWORD_REQUIRED = "Password is required";
	public static final String PASSWORD_MIN_LENGTH = "Password must be at least 6 characters";
	public static final String NAME_REQUIRED = "Name is required";
}
