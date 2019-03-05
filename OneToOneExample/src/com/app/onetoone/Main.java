package com.app.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	

	// TODO Auto-generated constructor stub
	
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	Session session=factory.openSession();
	Student student=new Student();
	student.setMarks(2);student.setStudentId(36);student.setStudentName("dfd");
	
	
	Transaction transaction=session.beginTransaction();
	session.save(student);
	System.out.println("hello");
	transaction.commit();
	factory.close();session.close();
	
	
}
}
