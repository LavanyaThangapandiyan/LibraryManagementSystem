package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.training.model.Books;
import com.training.model.Student;
import com.training.util.ConnectionUtil;

public class BooksImpl implements BooksDao
{
	@Override
	public void saveBookDetails(Books book) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String s="insert into book(ISBN,name,rack_no,author,edition)values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(s);
		ps.setInt(1, book.getISBN());
		ps.setString(2, book.getName());
		ps.setInt(3,book.getRackNumber());
		ps.setString(4,book.getAuthor());
		ps.setInt(5, book.getEdition());
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);		
	}
	@Override
	public int updateRackNumber(int isbn, int rackNumber) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionUtil.getConnection();
		String s="update book set rack_no='"+rackNumber+"' where ISBN='"+isbn+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
	}

	@Override
	public int deleteBookDetails() throws ClassNotFoundException, SQLException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Doyou Want Delete Book Details:");
		System.out.println("Enter Book ISBN Number");
		int isbn=sc.nextInt();
		Connection con=ConnectionUtil.getConnection();
		String s="delete from book where ISBN='"+isbn+"'";
		PreparedStatement ps=con.prepareStatement(s);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
	}

	@Override
	public void findAuthorkName(String name) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select name,author from book where name='"+name+"'");
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		}
	
	@Override
	public void findRackNumber(int isbn) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("Select ISBN,name,rack_no from book where ISBN='"+isbn+"'");
		while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));	
		
		
	}
	@Override
	public List<Books> bookList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String s="select ISBN,name,rack_no,author,edition from book";
		PreparedStatement ps=con.prepareStatement(s);
		ResultSet rs=ps.executeQuery();
		ArrayList list=new ArrayList<>();
		while(rs.next())
		{
			int ISBN=rs.getInt(1);
			String name=rs.getString(2);
			int rackNumber=rs.getInt(3);
			String author=rs.getString(4);
			int edition=rs.getInt(5);
			Books book=new Books();
			book.setISBN(ISBN);
			book.setName(name);
			book.setRackNumber(rackNumber);
			book.setAuthor(author);
			book.setEdition(edition);
			list.add(book);
			
		}return list;
	}



	

}
