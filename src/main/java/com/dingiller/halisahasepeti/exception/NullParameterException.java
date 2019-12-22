package com.dingiller.halisahasepeti.exception;

public class NullParameterException extends Exception {
	private static final String NULL_PARAMETER = "PARAMETER IS NULL";

	public NullParameterException(){
		super(NULL_PARAMETER);
	}

	public NullParameterException(String message){
		super(message);
	}
}
