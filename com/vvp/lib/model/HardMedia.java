package com.vvp.lib.model;

public class HardMedia extends Media{

	float Weight;
	HardMedia(int BookId,String Title,int Availablity,float Weight){
		
		super(BookId,Title,Availablity);
		this.Weight=Weight;
	}
}