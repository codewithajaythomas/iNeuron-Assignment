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

		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				Blog post = new Blog();
				post.setTitle("AWS");
				post.setDescription("Developed by Amazon");
				post.setContent("Cloud Platform");
				session.save(post);
				flag = true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object inserted to database....");
			} else {
				transaction.rollback();
				System.out.println("Object not inserted to database...");
			}
		}
		
		try {

			if (session != null) {
				
				Query query = session.createQuery("from Blog order by id DESC");
				query.setMaxResults(1);
				Blog post = (Blog) query.uniqueResult();
				if (post != null)
					System.out.println(post);
				else
					System.out.println("Record found in the table");
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
