package com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Mymain {

	 private static SessionFactory factory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
		 try {
	         factory = meta.getSessionFactoryBuilder().build();
	         Session session = factory.openSession();  
	         Transaction t = session.beginTransaction();
	         
	         employee e1=new employee();    
	         e1.setId(7);    
	         e1.setName("Uyaz");    
	         e1.setAge(23);
	         e1.setAddr("Kollegal");
	         e1.setSal(30000);
	             
	         session.save(e1);  
	         t.commit();  
	         System.out.println("successfully saved");    
	         factory.close();  
	         session.close();   
	         
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	}

}

	

