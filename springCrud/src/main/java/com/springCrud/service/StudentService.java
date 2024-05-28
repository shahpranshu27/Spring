package com.springCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springCrud.Student;
import com.springCrud.dao.StudentDao;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Transactional
	public int insert(Student student) {
		return studentDao.insert(student);
	}
	
	@Transactional
	public int update(Student student) {
		return studentDao.update(student);
	}
	
	@Transactional
	public int delete(int id) {
		return studentDao.delete(id);
	}
	
	@Transactional
	public Student getById(int id) {
		return studentDao.getById(id);
	}
	
	@Transactional
	public List<Student> getAll() {
		return studentDao.getAll();
	}
	
}
