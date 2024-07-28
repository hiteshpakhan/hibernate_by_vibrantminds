package com.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.model.Gift;
import com.model.Laptop;
import com.model.Student;
import com.util.HBUtils;

public class App {
	public static void main(String[] args) {
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
	
		//this is where you can act of your own
		
		tx.commit();
		session.close();
	}
}
	
	












//
//Student s1 = session.get(Student.class, 2);	//1 number student fetched here
//Laptop l1 = session.get(Laptop.class, 1);	//3 number laptop fetched here
//
//s1.setLaptop(l1);	//here we have set the laptop into student
//l1.setStudent(s1);	//here we have set the student into laptop
//
//
////		detached object we fetched means it comes in perstance we made changes into it and we did transaction commit means it will go back to the detached
////		thats why we dont have to use the save and update command here