package com.training.model;

public class Books 
{
	private int ISBN;
	private String name;
	private int rackNumber;
	private String author;
	private int edition;
	public Books()
	{	
	}
	public Books(int isbn,String bookName,int rackNumber,String authorName,int edition)
	{
		this.ISBN=ISBN;
		this.name=bookName;
		this.rackNumber=rackNumber;
		this.author=authorName;
		this.edition=edition;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRackNumber() {
		return rackNumber;
	}
	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "Books [ISBN=" + ISBN + ", name=" + name + ", rackNumber=" + rackNumber + ", author=" + author
				+ ", edition=" + edition + ", getISBN()=" + getISBN() + ", getName()=" + getName()
				+ ", getRackNumber()=" + getRackNumber() + ", getAuthor()=" + getAuthor() + ", getEdition()="
				+ getEdition() + "]";
	}
	
	
	
}
