package com.tap.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;

public class HibernateManager {

	Session session=null;
	public  HibernateManager()
	{
		session=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(CustomerDetails.class).addAnnotatedClass(OrderTable.class).buildSessionFactory().openSession();
	}
	public void saveOrder(OrderTable ot) {
	    session.beginTransaction();
	    session.persist(ot);
	    session.getTransaction().commit();
		
	}
	public void saveOrder(Customer c) {
		  session.beginTransaction();
		  session.persist(c);
		  session.getTransaction().commit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void add(Customer  c)
//	{
//		Transaction t=(Transaction) session.beginTransaction();
//		session.persist(c);
//		try {
//			t.commit();
//		} catch (	Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public void add(CustomerDetails cd) {
//		Transaction t=(Transaction) session.beginTransaction();
//		session.persist(cd);
//		try {
//			t.commit();
//		} catch (	Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	public Customer getbasedId(int id)
//	{
//		Transaction t = (Transaction) session.beginTransaction();
//		Customer c=session.get(Customer.class, id);
//		if(c!=null) {
//		return c;
//		}
//		return null;
//	}
//	
//	public void update(int id,String name,String email)
//	{
//		Transaction t=(Transaction) session.beginTransaction();
//		Customer c=session.get(Customer.class, id);
//		if(c!=null)
//		{
//			c.setName(name);
//			c.getCcid().setEmail(email);
//			session.update(c);
//		}
//		else
//			System.out.println("no such record");
//		try {
//			t.commit();
//		} catch (	Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public void delete(int id)
//	{
//		Transaction t=(Transaction) session.beginTransaction();
//		Customer c=session.get(Customer.class, id);
//		if(c!=null)
//		{
//			session.delete(c);
//		}
//		else
//			System.out.println("no such record");
//		try {
//			t.commit();
//		} catch (	Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public void getAll() {
//		Transaction t=(Transaction) session.beginTransaction();
//		String q="*from Customer";
//		Query<Customer> q1 = session.createQuery(q,Customer.class);
//	    List<Customer> customerList = q1.list();
//		for(Customer c:customerList)
//		{
//			System.out.println(c.getCid()+" "+c.getName()+" "+c.getCcid().getEmail()+" "+c.getCcid().getMobile());
//		}
//		
//		try {
//			t.commit();
//		} catch (	Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//	}
//
//	public CustomerDetails getCDbasedonId(int id) {
//		session.beginTransaction();
//		CustomerDetails cd = session.get(CustomerDetails.class, id);
//		return cd;
//	}
//	
}
