package com.vvp.lib.view;
import com.vvp.lib.model.*;
import com.vvp.lib.controller.*;
import java.util.*;
import static java.lang.System.*; 

//onfiregamer123
public class LibView{

	static void action(){
		
		Scanner input= new Scanner(in);
		while(true){
			try{
			int UserId,BookId;
			out.println("Library Management System\n1.Check Balance\n2.Issue Book\n3.Return Book\n4.Search Book\n5.Exit");
			int choice = input.nextInt();
			switch(choice){	
				
				case 1: out.println("Enter User Id:-");
						UserId = input.nextInt(); 
						int Check = Transaction.checkBalance(UserId);
						if (Check == -1)
							out.println("OOPS!!! User Not Found");
						else
							out.println("Balance is:-"+Check);
						break;
				case 2: out.println("Enter User Id:-");
						UserId = input.nextInt();
						out.println("Enter Book Id:-");
						BookId = input.nextInt();
						String msg = Transaction.issueBook(BookId,UserId);
						out.println(msg);
						break;
				case 3: out.println("Enter User Id:-");
						UserId = input.nextInt();
						out.println("Enter Book Id:-");
						BookId = input.nextInt();
						String msg1 = Transaction.returnBook(BookId,UserId);
						out.println(msg1);
						break;
				case 4: out.println("Enter Book Id:-");
						BookId = input.nextInt(); 
						int Check1 = Transaction.searchBook(BookId);
						if (Check1 == -1)
							out.println("OOPS!!! Book Not Found");
						else
							out.println("Available Book is:-"+Check1);
						break;
				case 5: exit(0);
						break;
				default: out.println("Invalid choice");
						break;
			}
			}
			catch (BookNotFoundException bnfe){
				out.println(bnfe);
			}
			catch (UserNotFoundException unfe){
				out.println(unfe);
			}
			catch (BookNotAvailableException bnae){
				out.println(bnae);
			}
			catch (InsufficentBookBalanceException ibbe){
				out.println(ibbe);
			}
		}
	}
	public static void main(String args[]){
		
		Dao.initData();
		action();
	}
}