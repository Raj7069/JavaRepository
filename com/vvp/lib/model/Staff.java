package com.vvp.lib.model;

public class Staff extends User{

	String JoiningDate;
	Staff(int UserId,String UserName,String JoiningDate){
		
		super(UserId,UserName);
		this.JoiningDate=JoiningDate;
	
	}
}