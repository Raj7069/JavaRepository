package com.vvp.lib.model;

public class Student extends User{

	public int Sem,BookBalance;
	public String Branch;
	Student(int UserId,String UserName,int Sem,int BookBalance,String Branch){
		
		super(UserId,UserName);
		this.Sem=Sem;
		this.BookBalance=BookBalance;
		this.Branch=Branch;
	}
}