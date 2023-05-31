package com.codewithajay.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/course-list")
public class CourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String userName = session.getAttribute("user_name").toString();
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"  <head>\r\n" + 
				"    <meta charset=\"UTF-8\" />\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n" + 
				"    <title>Read Inputs</title>\r\n" + 
				"    <link\r\n" + 
				"      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\r\n" + 
				"      rel=\"stylesheet\"\r\n" + 
				"      integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\"\r\n" + 
				"      crossorigin=\"anonymous\"\r\n" + 
				"    />\r\n" + 
				"  </head>\r\n" + 
				"  <body>\r\n" + 
				"    <div class=\"container\">\r\n" + 
				"      <div class=\"card mt-5\">\r\n" + 
				"        <div class=\"card-body text-center\">\r\n" + 
				"            <h3> Hi "+userName+" !! these are the courses you have renrolled</h3>" + 
				"			 <ol class=\"list-group\"><li class=\"list-group-item\">Spring Boot</li ><li class=\"list-group-item\">Flutter</li><li class=\"list-group-item\">AWS</li></ol>		"+
				"        </div>\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <script\r\n" + 
				"      src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"\r\n" + 
				"      integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\"\r\n" + 
				"      crossorigin=\"anonymous\"\r\n" + 
				"    ></script>\r\n" + 
				"    <script\r\n" + 
				"      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js\"\r\n" + 
				"      integrity=\"sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V\"\r\n" + 
				"      crossorigin=\"anonymous\"\r\n" + 
				"    ></script>\r\n" + 
				"  </body>\r\n" + 
				"</html>\r\n" + 
				"");
		out.close();
	}

}
