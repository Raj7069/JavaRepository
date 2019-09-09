package com.vvp.lib.controller;


public class UserNotFoundException extends Exception{

	public String getMessage(){
	
		return "OOPS!!! User Not Found";
	}
	
	public String toString(){
	
		return "com.vvp.lib.controller.UserNotFoundException: OOPS!!! User Not Found ...";
	}
}