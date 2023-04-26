package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.model.Books;

public interface BooksDao 
{
	public void saveBookDetails(Books book) throws ClassNotFoundException, SQLException;
	public int updateRackNumber(int isbn,int rackNumber) throws ClassNotFoundException, SQLException;
	public int deleteBookDetails() throws ClassNotFoundException, SQLException;
	public void findAuthorkName(String name) throws SQLException, ClassNotFoundException;
	public void findRackNumber(int isbn) throws ClassNotFoundException, SQLException;
	public List<Books> bookList() throws ClassNotFoundException, SQLException;

}
