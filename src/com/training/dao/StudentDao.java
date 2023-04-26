package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.model.Student;

public interface StudentDao
{
	public void saveStudentDetails(Student std) throws ClassNotFoundException, SQLException;
	public int updateStudentName(int id,String name) throws ClassNotFoundException, SQLException; 
	public int deleteStudentDetails() throws ClassNotFoundException, SQLException;
	public void findStudentId(String name) throws ClassNotFoundException, SQLException;
	public void findStudentName(int id) throws ClassNotFoundException, SQLException;
	public void findStudentDepartment(int id) throws ClassNotFoundException, SQLException;
	public List<Student> studentList() throws ClassNotFoundException, SQLException;
	

}
