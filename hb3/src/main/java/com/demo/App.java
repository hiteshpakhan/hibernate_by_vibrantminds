package com.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.model.Student;
import com.util.HBUtils;

public class App {
	public static void main(String[] args) {
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();

		
				
		
		tx.commit();
		session.close();
	}
}
	
	