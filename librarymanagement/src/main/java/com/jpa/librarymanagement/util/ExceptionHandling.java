package com.jpa.librarymanagement.util;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(Exception e) {
		CustomErrorResponse customErrorResponse = new CustomErrorResponse();
		customErrorResponse.message = e.getMessage();
		customErrorResponse.timeStamp = LocalDateTime.now();
		customErrorResponse.exceptionMessage = e.getCause().getMessage();
		return new ResponseEntity<CustomErrorResponse>(customErrorResponse, HttpStatus.NOT_FOUND);
	}

}

class CustomErrorResponse {
	public LocalDateTime timeStamp;
	public String message;
	public String exceptionMessage;
}
