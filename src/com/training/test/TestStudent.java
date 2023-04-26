package com.training.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.training.dao.StudentImpl;
import com.training.model.Student;
import com.training.util.ConnectionUtil;

public class TestStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//ConnectionUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		StudentImpl stdimp=new StudentImpl();
		
		
		System.out.println("If you Want Find Student ID-->Enter 1 \n IF you Want Find Department--> Enter 2 \n Find Student Name -->Enter 3");
		int number=sc.nextInt();
		if(number==1)
		{
		System.out.println("Enter Student Name:");
		String name=sc.next();
		stdimp.findStudentId(name);
		}
		else if(number==2)
		{
			System.out.println("Enter Student ID:");
			int id=sc.nextInt();
			if(id>=10000)
			stdimp.findStudentDepartment(id);
			else
				System.out.println("Invalid ID");
		}
		else if(number==3)
		{
			System.out.println("Enter Student ID:");
			int id=sc.nextInt();
			if(id>=10000)
			stdimp.findStudentName(id);
			else
				System.out.println("Invalid ID..");
		}
		else
			System.out.println("Invalid Input");
		
		//stdimp.deleteStudentDetails();
							
	  /* System.out.println("Do you Want to Update Name");
	   System.out.println("Enter Student ID");
	   int id=sc.nextInt();
	   if(id>10000)
	   {
	   System.out.println("Enter Student Name");
	   String name=sc.next();
	   stdimp.updateStudentName(id, name);
	   }
	   else
	   System.out.println("Invalid Student ID");
		
		
		/*List<Student> studentList = stdimp.studentList();
		System.out.println(studentList);
					
		/*
		int id=10008;
		String name="Tom";
		String department="English";
		if(id>0)
		{
		Student std=new Student();
		std.setId(id);
		std.setName(name);
		std.setDepartment(department);
		stdimp.saveStudentDetails(std);
		}
		else
			System.out.println("Invalid Input");*/
		

	}

}
