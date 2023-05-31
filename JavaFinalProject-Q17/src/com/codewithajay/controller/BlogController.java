package com.codewithajay.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codewithajay.dto.Blog;
import com.codewithajay.service.IBlogService;
import com.codewithajay.servicefactory.BlogServiceFactory;


@WebServlet("/blog/*")
public class BlogController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IBlogService blogService = BlogServiceFactory.getBlogService();

		System.out.println("Request URI :: " + request.getRequestURI());
		System.out.println("Path info   :: " + request.getPathInfo());

		if (request.getRequestURI().endsWith("newpost")) {
			
			RequestDispatcher rd = null;
			
			rd = request.getRequestDispatcher("../createpost.jsp");
			rd.forward(request, response);
			
		}
		
		if (request.getRequestURI().endsWith("savepost")) {
			
			Blog post = new Blog();
			
			post.setTitle(request.getParameter("title"));
			post.setDescription(request.getParameter("description"));
			post.setContent(request.getParameter("content"));
			
			String msg = blogService.savePost(post);	
			
			request.setAttribute("msg", msg);
			
			//System.out.println("title: "+request.getParameter("title")+" description: "+request.getParameter("description")+" content: "+request.getParameter("content"));
					
		   RequestDispatcher rd = null;
		  
		   rd = request.getRequestDispatcher("../alert.jsp");
		   rd.forward(request,response);			
		}

		if (request.getRequestURI().endsWith("view")) {
			
			  
		   List<Blog> allPosts = blogService.getAllPosts();
		   request.setAttribute("posts", allPosts);
		  
		   RequestDispatcher rd = null; 
		   rd = request.getRequestDispatcher("../blog.jsp"); 
		   rd.forward(request, response);
			 
		}

	}

}
