package com.training.model;

public class Staff {
	private int id;
	private String name;
	private String designation;
	private String phoneNumber;
	public Staff()
	{
		
	}
	public Staff(int id,String name,String designation,String phoneNumber)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.phoneNumber=phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", designation=" + designation + ", phoneNumber=" + phoneNumber
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getDesignation()=" + getDesignation()
				+ ", getPhoneNumber()=" + getPhoneNumber() + "]";
	}
	
}
