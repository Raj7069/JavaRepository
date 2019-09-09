package com.vvp.lib.controller;

public class BookNotFoundException extends Exception{

	public String getMessage(){
	
		return "OOPS!!! Book Not Found";
	}
	
	public String toString(){
	
		return "com.vvp.lib.controller.BookNotFoundException: OOPS!!! Book Not Found ...";
	}
}