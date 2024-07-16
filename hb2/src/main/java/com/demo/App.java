package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.HBUtils;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = HBUtils.sf.openSession();		
    	
    	Transaction tx = session.beginTransaction();
    	
    	Student s1 = new Student();
    	s1.setSname("amit patil");
    	s1.setScity("goa");
    	s1.setSpercentage(91.22);
    	session.save(s1);
    	
    	tx.commit();
    	session.close();
    }
}
