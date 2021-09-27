package com.springorm.dao;

import java.util.List;

import com.springorm.entity.Student;

public interface StudentDao {
	public int save(Student student);
	public void delete(int studentid);
	public void update(Student student);
	public List<Student> getAllStudent();
	public Student getStudentById(int id);
}
