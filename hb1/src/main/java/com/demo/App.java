package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       Configuration con = new Configuration().configure();
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       
       Student s1 = new Student();
       s1.setSname("ganeshpatil3");
       s1.setScity("jaipur3");
       s1.setSpercentage(93.11);
       System.out.println(session.save(s1));
       
       tx.commit();
       session.close();
       
    }
}


//package com.demo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.model.Student;
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Configuration con = new Configuration().configure();	//this is used to only load the cfg file 
//    	SessionFactory sf = con.buildSessionFactory();			//this is used in making the connection
//    		
//    	Session session = sf.openSession();	
//    	
//    	Transaction tx = session.beginTransaction();	
//    	
//    	Student s1 = new Student();
//    	s1.setSname("first name");
//    	s1.setScity("jaipur");
//    	s1.setSpercentage(91.11);
//    	System.out.println(session.save(s1));
//    	    	
//    	tx.commit();
//    	session.close();
//    	
//    }
//}
