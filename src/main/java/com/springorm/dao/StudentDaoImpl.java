package com.springorm.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springorm.entity.Student;

@Component
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int save(Student student) {
		return (Integer) hibernateTemplate.save(student);
	}
	@Transactional
	public void update(Student student) {
		hibernateTemplate.update(student);
	}
	@Transactional
	public void delete(int studentid) {
		hibernateTemplate.delete(getStudentById(studentid));
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public List<Student> getAllStudent() {
		return hibernateTemplate.loadAll(Student.class);
	}
	public Student getStudentById(int id) {
		return hibernateTemplate.get(Student.class, id);
	}
	
	
}
