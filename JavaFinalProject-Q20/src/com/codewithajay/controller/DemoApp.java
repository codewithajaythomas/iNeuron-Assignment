package com.codewithajay.controller;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.codewithajay.model.Blog;
import com.codewithajay.util.HibernateUtil;

public class DemoApp {

	public static void main(String[] args) throws Exception {
		
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		int id = 5;

		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				Blog post = new Blog();
				post.setId(id);
				post.setTitle("React");
				post.setDescription("Developed by Facebook");
				post.setContent("JS library");
				session.update(post);
				flag = true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object updated to database....");
			} else {
				transaction.rollback();
				System.out.println("Object not updated to database...");
			}
		}
		
		try {
			
			if (session != null) {
				
				Blog post = session.get(Blog.class, id);
				if (post != null)
					System.out.println(post);
				else
					System.out.println("Record not found for the given id :: "+id);
			}
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}
}
