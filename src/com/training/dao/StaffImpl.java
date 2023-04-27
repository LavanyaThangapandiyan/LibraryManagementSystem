package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.training.model.Staff;
import com.training.util.ConnectionUtil;

public class StaffImpl implements StaffDao
{

	@Override
	public void saveStaffDetails(Staff staff) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String s="insert into staff(s_id,name,designation,phone)values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(s);
		ps.setInt(1,staff.getId());
		ps.setString(2, staff.getName());
		ps.setString(3, staff.getDesignation());
		ps.setString(4, staff.getPhoneNumber());
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);			
		
	}

	@Override
	public void updateStaffName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStaffDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findStaffId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findStaffName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findStaffDesignation() {
		// TODO Auto-generated method stub
		
	}

}
