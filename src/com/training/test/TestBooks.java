package com.training.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.training.dao.BooksImpl;
import com.training.model.Books;
import com.training.util.ConnectionUtil;

public class TestBooks {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  
	{
		//ConnectionUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		
		BooksImpl bookimpl=new BooksImpl();
		/*List<Books> bookList = bookimpl.bookList();
		System.out.println(bookList);
		
		System.out.println("Do you Want Find Rack Number \n Enter ISBN Number");
		int isbn=sc.nextInt();
		if(isbn>0)
			bookimpl.findRackNumber(isbn);	
		else
			System.out.println("Invalid Input");*/
		
		
		System.out.println("Do you Want to Find Author name :");
		System.out.println("Enter Book Name");
		String name=sc.nextLine();
		bookimpl.findAuthorkName(name);
		
						
		//bookimpl.deleteBookDetails();
		
		/*System.out.println("If you want to update Rack Number \n Please Enter Book ISBN numer ");
		int isbn=sc.nextInt();
		System.out.println("Enter Rack Number:");
		int rackNumber=sc.nextInt();
		if(isbn>0&&rackNumber>0)
		{
		bookimpl.updateRackNumber(isbn, rackNumber);
		}
		else
			System.out.println("Invalid Input...");*/
		
		
		/*Books book=new Books(); 
		System.out.println("Enter ISBN Number :");
		int isbn=sc.nextInt();
		System.out.println("Enter Book Name :");
		String name=sc.next();
		System.out.println("Enter Rack Number :");
		int rackNumber=sc.nextInt();
		System.out.println("Enter Author Name:");
		String author=sc.next();
		System.out.println("Enter the Edition of the Book");
		int edition=sc.nextInt();
		if(isbn>100&&rackNumber>0&&edition>0)
		{
		book.setISBN(isbn);
		book.setName(name);
		book.setRackNumber(rackNumber);
		book.setAuthor(author);
		book.setEdition(edition);
		System.out.println("Data Inserted");
		bookimpl.saveBookDetails(book);
		System.out.println("Data Successfully Enterd");
		}
		else
			System.out.println("Invalid Data");*/
		
			
		}

}
