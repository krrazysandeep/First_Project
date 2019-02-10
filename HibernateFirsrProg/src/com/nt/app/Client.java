package com.nt.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import test.Employee;

public class Client {

	public static void main(String[] args) 
	{
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tx=ses.beginTransaction();
	Employee emp=new Employee();
	emp.setEmpno(101);
	emp.setEmpname("sANEEP");
	emp.setAddress("Ranchi");
ses.save(emp);
tx.commit();
ses.close();
	
	
	

	}

}
