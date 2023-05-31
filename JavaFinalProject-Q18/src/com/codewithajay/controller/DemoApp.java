package com.codewithajay.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.codewithajay.model.Blog;
import com.codewithajay.util.HibernateUtil;

public class DemoApp {

	public static void main(String[] args) throws Exception {

		Session session = null;
		int id = 1;
		try {
			session = HibernateUtil.getSession();

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
