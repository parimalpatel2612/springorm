package com.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext con = new ClassPathXmlApplicationContext("com/springorm/config.xml");
    	StudentDao studentDao = con.getBean("studentDaoImpl", StudentDao.class);
//    	Student st = new Student(6, "Ram", "Ayodhya");
//    	studentDao.save(st);
//    	Student st = new Student(6, "RamSyam", "Ayodhya");
//    	studentDao.update(st);
//    	Student st = new Student(6, "RamSyam", "Ayodhya");
//    	studentDao.delete(st);
//    	System.out.println(studentDao.getAllStudent());
//    	System.out.println(studentDao.getStudentById(5));
    	
    }
}
