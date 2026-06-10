package com.example.demo.dtos;

import org.springframework.http.HttpStatus;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class SuccessResponse<T> extends ApiResponse<T> {
	
	public SuccessResponse(int statusCode, HttpStatus status, String message, T data) {
		super(statusCode, status, message, data);
	}
}
