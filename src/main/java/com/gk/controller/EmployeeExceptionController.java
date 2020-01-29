package com.gk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gk.service.impl.EmployeeNotFoundException;

@ControllerAdvice
public class EmployeeExceptionController {

	@ExceptionHandler(value= {EmployeeNotFoundException.class})
	public ResponseEntity<Object> exception() {
	
		return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
	}
}
