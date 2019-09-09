package com.vvp.lib.controller;


public class InsufficentBookBalanceException extends Exception{

	public String getMessage(){
	
		return "OOPS!!! User Not Found";
	}
	
	public String toString(){
	
		return "com.vvp.lib.controller.InsufficentBookBalanceException: OOPS!!! Book Balance is Not Sufficient ...";
	}
}