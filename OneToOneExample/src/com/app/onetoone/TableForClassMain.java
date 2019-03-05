package com.app.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import tableforsubclass.inheritancetype.PojoClass.Cheque;
import tableforsubclass.inheritancetype.PojoClass.CredtCard;
import tableforsubclass.inheritancetype.PojoClass.Payment;

public class TableForClassMain {
public static void main(String[] args) {
	

	// TODO Auto-generated constructor stub
	
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	Session session=factory.openSession();
	CredtCard c=new CredtCard();
	c.setCardNumber(34);
	c.setCardType("visa");
	c.setAmount(4535);
	c.setPaymentId(3);
	
	Cheque ch=new Cheque();
	ch.setChequeNumber(45);ch.setChequeType("one");
	ch.setAmount(343);ch.setPaymentId(45);
	
	
	Payment p=new Payment();
	p.setPaymentId(34);p.setAmount(98787);
	
	
	
	
	
	
	Transaction transaction=session.beginTransaction();
	session.save(p);
	session.save(c);
	session.save(ch);
	System.out.println("hello");
	
	
	
	transaction.commit();
	factory.close();session.close();
	
	
}
}
