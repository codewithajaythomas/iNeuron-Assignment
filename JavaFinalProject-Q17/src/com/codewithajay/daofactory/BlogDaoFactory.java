package com.codewithajay.daofactory;

import com.codewithajay.repository.IBlogDao;
import com.codewithajay.repository.BlogDaoImpl;

public class BlogDaoFactory {

	private BlogDaoFactory() {}

	private static IBlogDao blogDao = null;

	public static IBlogDao getBlogDao() {
		if (blogDao == null) {
			blogDao = new BlogDaoImpl();
		}
		return blogDao;
	}
}
