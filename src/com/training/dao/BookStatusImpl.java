package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.training.model.BookStatus;
import com.training.model.Student;
import com.training.util.ConnectionUtil;

public class BookStatusImpl implements BookStatusDao
{
    
	@Override
	public void saveBookStatus(BookStatus booksts) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String s="insert into book_status(issue_id,date,student_id,book_id)values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(s);
		ps.setInt(1,booksts.getIssueId());
	    ps.setString(2, booksts.getDate());
		ps.setInt(3,booksts.getStudentId());
		ps.setInt(4,booksts.getBookId());
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		
	}

	@Override
	public int updateBookIssueDate(int issueId,String date) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String s="update book_status set date='"+date+"' where issue_id='"+issueId+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
	}

	@Override
	public int deleteBookStatus() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you Want delete One Book Status");
		System.out.println("Enter Book ISSUE ID:");
		int issueId=sc.nextInt();
		Connection con=ConnectionUtil.getConnection();
		String s="delete from book_status where issue_id='"+issueId+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
		
	}

	@Override
	public void findByIssueId(int studentId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select issue_id,date,student_id,book_id from book_status where student_id='"+studentId+"'");
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));	
	}

	@Override
	public void findDate(int issueId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select issue_id,date,student_id,book_id from book_status where issue_id='"+issueId+"'");
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));	
		
	}

	@Override
	public List bookStatusList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String s="select issue_id,date,student_id,book_id from book_status";
		PreparedStatement ps=con.prepareStatement(s);
		ResultSet rs=ps.executeQuery();
		ArrayList list=new ArrayList<>();
		while(rs.next())
		{
			int id=rs.getInt(1);
			String date=rs.getString(2);
			int studentId=rs.getInt(3);
			int bookId=rs.getInt(4);
			BookStatus book=new BookStatus();
			book.setIssueId(id);
			book.setDate(date);
			book.setStudentId(studentId);
			book.setBookId(bookId);
			list.add(book);
		}
		
		return list;
		
	}

}
