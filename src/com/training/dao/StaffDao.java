package com.training.dao;

import java.sql.SQLException;

import com.training.model.Staff;

public interface StaffDao 
{
	public void saveStaffDetails(Staff staff) throws ClassNotFoundException, SQLException;
	public void updateStaffName();
	public void deleteStaffDetails();
	public void findStaffId();
	public void findStaffName();
	public void findStaffDesignation();

}
