package org.mishra.com.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyContollerAdwise {
	
	@ExceptionHandler(value=RuntimeException.class)
	public String exceptionHandler(){
		return "RuntimeException";
	}

}
