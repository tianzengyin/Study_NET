package com.zengyin.exceptionPractice01;

public class RegisterException extends /*Exception*/ RuntimeException{
	RegisterException(){
		super();
	}
	
	RegisterException(String message){
		super(message);
	}
}
