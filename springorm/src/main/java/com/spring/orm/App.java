package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    	
//    	Student student = new Student(1234,"durgesh","kanpur");
    	Student student3 = new Student(60028,"p","ranchi");
//    	int insert = studentDao.insert(student);
    	int ins2  = studentDao.insert(student3);
    	System.out.println(ins2 + ": updated values");
     }
}
