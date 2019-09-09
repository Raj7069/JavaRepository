package com.vvp.lib.model;

public class SoftMedia extends Media{

	float Size;
	SoftMedia(int BookId,String Title,int Availablity,float Size){
		
		super(BookId,Title,Availablity);
		this.Size=Size;
	}
}