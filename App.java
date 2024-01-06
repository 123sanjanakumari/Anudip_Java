package com.sanju.Hibernate_reffression;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main( String[] args ) 
    {

		    User user1= new User();
	     
	        
	        user1.setUsername("Sanjana");
	        user1.setAddress("Kolkata");
	        user1.setSalary(250000.0);
	        
	        
	    	User user2= new User();
	    	user2.setUsername("Anjali");
	    	user2.setAddress("Delhi");
	    	user2.setSalary(300000.0);
	    	
	    	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	    	
	    	Session s = sf.openSession();
	        Transaction tx = s.beginTransaction();

	        s.save(user1); // Save the user to generate an ID
	        s.save(user2); // Save the user to generate an ID
	        
	        
	        tx.commit(); // Commit the transaction
	        s.close();
	        
	    	Session session1 = sf.openSession();
	    	Transaction tx1 = session1.beginTransaction();

	    	User user3 = session1.get(User.class, 1);
	    	System.out.println(user3);

	    	tx1.commit(); // Commit the transaction before closing the session
	    	session1.close();

	    	Session session2 = sf.openSession();
	    	Transaction tx2 = session2.beginTransaction();

	    	User user4 = session2.get(User.class, 2);
	    	System.out.println(user4);
	    	
	    	tx2.commit(); // Commit the transaction before closing the session
	    	session2.close();

	    	sf.close();

        
		
    }
	
		
}
