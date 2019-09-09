package com.vvp.lib.model;

public class Media{

	public String Title,PublicationName;
	public float Price;
	public int Availablity,BookId;
	
	Media(int BookId,String Title,int Availablity){
		
		this.BookId=BookId;
		this.Title=Title;
		this.Availablity=Availablity;
	}
	
}