package com.example.demo.dtos;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ApiResponse<T> {
	
	private int statusCode;
	private HttpStatus status;
	private String message;
	private T data;
}
