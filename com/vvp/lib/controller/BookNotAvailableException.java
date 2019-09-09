package com.vvp.lib.controller;
 

public class BookNotAvailableException extends Exception{

	public String getMessage(){
	
		return "OOPS!!! User Not Found";
	}
	
	public String toString(){
	
		return "com.vvp.lib.controller.BookNotAvailableException: OOPS!!! Book is Not Available ...";
	}
}