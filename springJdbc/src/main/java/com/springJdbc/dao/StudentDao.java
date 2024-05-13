package com.springJdbc.dao;

import com.springJdbc.entities.Student;

public interface StudentDao {
//	public int insert();

	public int insert(Student student);
	
	public int change(Student student);
	
//	public int delete(Student student);
	
	public int delete(int studentId);
}
