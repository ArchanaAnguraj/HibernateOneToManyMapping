package com.tap.entity;

import java.util.ArrayList;

public class Launch {
  public static void main(String[]args) {
	  
	  HibernateManager hm=new HibernateManager();
	  Customer c=new Customer(1,"anu");
	  CustomerDetails cd=new CustomerDetails(1,"anu@gmail.com",12345);
	  
	  c.setCcid(cd);
	  
	  OrderTable ot=new OrderTable("idly",40);
	  OrderTable ot1=new OrderTable("dosa",40);
	  
	  
	  //this for storing oreds to customer
	  ArrayList<OrderTable>list=new ArrayList<OrderTable>();
	  list.add(ot1);
	  list.add(ot);
	  c.setOrders(list);
	  hm.saveOrder(c);
	  
	  ot.setCustomer(c);
	  ot1.setCustomer(c);
	  
	  
	  
	  hm.saveOrder(ot);
	  hm.saveOrder(ot1);
	  
	  
}
}
