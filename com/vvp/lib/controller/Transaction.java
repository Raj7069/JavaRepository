package com.vvp.lib.controller;
import com.vvp.lib.model.*;
import com.vvp.lib.view.*;
import java.util.*;
import static com.vvp.lib.model.Dao.*;
import static java.lang.System.*; 

public class Transaction{
	
	public static int checkBalance(int UserId){
		int i=0;
		for(i=0;i<students.length;i++){
			
			if (students[i].UserId == UserId){
				
				return students[i].BookBalance	;
			}
		}
		return -1;
	}
	
	public static String issueBook(int BookId,int UserId)
	throws UserNotFoundException,InsufficentBookBalanceException,BookNotFoundException,BookNotAvailableException
	{
		int i,j;
		for (i=0;i<students.length;i++){
			
			if(students[i].UserId == UserId)
				break;
		}
		if (i == students.length)
		{
			throw new UserNotFoundException();
		}
		if (students[i].BookBalance > 3){
			
			throw new InsufficentBookBalanceException();
		}
		else
			students[i].BookBalance++;
		
		for (j=0;j<hm.length;j++){
			
			if (hm[j].BookId == BookId)	
				break;
		}
		if (j == hm.length)
		{
			throw new BookNotFoundException();
		}
		if (hm[j].Availablity < 1)
		{
			throw new BookNotAvailableException();
		}
		else{
			hm[j].Availablity--;
		}
		return "Book Issue successfully ...";
	}
	
	public static String returnBook(int BookId,int UserId)
	throws UserNotFoundException,BookNotFoundException{
		int i,j;
		for (i=0;i<students.length;i++){
			
			if(students[i].UserId == UserId)
				break;
		}
		
		if (i == students.length)
		{
			throw new UserNotFoundException();
		}
		for (j=0;j<hm.length;j++){
			
			if (hm[j].BookId == BookId)	
				break;
		}
		if (j == hm.length)
			throw new BookNotFoundException();
		students[i].BookBalance--;
		hm[j].Availablity++;
		
		return "Book Return successfully ...";
	}
	
	public static int searchBook(int BookId) throws BookNotFoundException{
		int i;
		
		for(i=0;i<hm.length;i++){
			
			if(hm[i].BookId == BookId)
				return hm[i].Availablity;
		}
		throw new BookNotFoundException();
	}	
}

