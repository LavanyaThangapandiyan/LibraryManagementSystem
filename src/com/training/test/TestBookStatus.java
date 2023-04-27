package com.training.test;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.training.dao.BookStatusImpl;
import com.training.model.BookStatus;
import com.training.util.ConnectionUtil;

public class TestBookStatus {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//ConnectionUtil.getConnection();
		
		
		Scanner sc=new Scanner(System.in);
		BookStatusImpl obj=new BookStatusImpl();
		List bookStatusList = obj.bookStatusList();
		System.out.println(bookStatusList);
		
		
		
		
		/*
		//-->update
		System.out.println("Do you want Update Issue Date of the Book");
		System.out.println("Enter your Issue ID");
		int issueId=sc.nextInt();
		System.out.println("Enter the new Date");
		String date=sc.next();
		obj.updateBookIssueDate(issueId, date);
		
		//--->find
		/*System.out.println("Do you Want Find Issue Id --> Enter 1\n Do you want Find Issue Date -->Enter 2 ");
		int number=sc.nextInt();
		if(number==1)
		{
		System.out.println("Please Enter Student ID");
		int studentId=sc.nextInt();
		if(studentId>=10000)
		obj.findByIssueId(studentId);
		else
			System.out.println("Invalid Student Id");
		}
		else if(number==2)
		{
			System.out.println("Please Enter Issue ID");
			int issueId=sc.nextInt();
			if(issueId>=1010)
				obj.findDate(issueId);
		}
		
		
		
		
		//-->delete
		//obj.deleteBookStatus();
		
		
		
		//---->insert
		/*int issueId=1013;
		String date="2022-12-26";
		int studentId=10005;
		int bookId=1003;
		if(issueId>1000)
		{
		BookStatus booksts=new BookStatus();
		booksts.setIssueId(issueId);
		booksts.setDate(date);
		if(studentId>=10000)
		{
		booksts.setStudentId(studentId);
		if(bookId>1001)
		{
		booksts.setBookId(bookId);
		obj.saveBookStatus(booksts);
		}else
			System.out.println("Invalid Input");
		}else
			System.out.println("Invalid Input");
		}else
			System.out.println("Invalid Input");*/
			
		
	}
}


