package com.onnea.web.exception;

public class OnneaException extends Exception {
	
	public OnneaException(String message){
		
		super(message);
	}
	
	public OnneaException(Throwable exception){
		
		super(exception);
	}

}
