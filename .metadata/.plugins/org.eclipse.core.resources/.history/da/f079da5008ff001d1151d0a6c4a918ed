package com.codewithajay.servicefactory;


import com.codewithajay.service.IBlogService;
import com.codewithajay.service.BlogServiceImpl;


//Abstraction logic of implementation
public class BlogServiceFactory {

	//make constuctor private to avoid object creation
	private BlogServiceFactory() {

	}

	private static IBlogService blogService = null;

	public static IBlogService getBlogService() {
		
		//singleton pattern code
		if (blogService == null) {
			blogService = new BlogServiceImpl();
		}
		return blogService;
	}

}
