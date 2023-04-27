package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.model.BookStatus;

public interface BookStatusDao {

	public void saveBookStatus(BookStatus booksts) throws ClassNotFoundException, SQLException;
	public int updateBookIssueDate(int issueId,String date) throws ClassNotFoundException, SQLException;
	public int deleteBookStatus() throws ClassNotFoundException, SQLException;
	public void findByIssueId(int studentId) throws ClassNotFoundException, SQLException;
	public void findDate(int issueId) throws ClassNotFoundException, SQLException;
	public List bookStatusList() throws ClassNotFoundException, SQLException;

}
