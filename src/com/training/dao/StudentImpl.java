package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.model.Student;
import com.training.util.ConnectionUtil;

public class StudentImpl implements StudentDao
{
	
    
	@Override
	public void saveStudentDetails(Student std) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionUtil.getConnection();
		String s="insert student(id,name,department)values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(s);
		ps.setInt(1,std.getId());
		ps.setString(2,std.getName());
		ps.setString(3, std.getDepartment());
		int executeUpdate= ps.executeUpdate();
		System.out.println(executeUpdate);	
	}

	@Override
	public int updateStudentName(int id,String name) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionUtil.getConnection();
		String s="update student set name='"+name+"' where id='"+id+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
		
	}

	@Override
	public int deleteStudentDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to Delete Student Details:");
		System.out.println("Enter Student ID");
		int id=sc.nextInt();
		Connection con=ConnectionUtil.getConnection();
		String s="delete from student where id='"+id+"'";
	    PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
		
	}

	@Override
	public void findStudentId(String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select id,department from student where name='"+name+"'");
		while(rs.next())
		System.out.println(rs.getString(1)+"\t"+rs.getString(2));
	}

	@Override
	public void findStudentDepartment(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select name,department from student where id='"+id+"'");
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		
	}

	@Override
	public void findStudentName(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select name,department from student where id='"+id+"'");
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		
	}

	@Override
	public List<Student> studentList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String s="select id,name,department from student";
		PreparedStatement ps=con.prepareStatement(s);
		ResultSet rs=ps.executeQuery();
		ArrayList list=new ArrayList<>();
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String department=rs.getString(3);
			Student std=new Student();
			std.setId(id);
			std.setName(name);
			std.setDepartment(department);
			list.add(std);
		}
		
		return list;
	}

}
