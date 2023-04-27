package com.training.model;
import java.time.LocalDateTime;
public class BookStatus 
{
	
	private int issueId;
	private String date;
	private int studentId;
	private int bookId;
	
	public BookStatus()
	{
		
	}
	public BookStatus(int issueId,String date,int studentId,int bookId)
	{
		this.issueId=issueId;
		this.date=date;
		this.studentId=studentId;
		this.bookId=bookId;
	}
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "BookStatus [issueId=" + issueId + ", date=" + date + ", studentId=" + studentId + ", bookId=" + bookId
				+ ", getIssueId()=" + getIssueId() + ", getDate()=" + getDate() + ", getStudentId()=" + getStudentId()
				+ ", getBookId()=" + getBookId() + "]";
	}
	
}
