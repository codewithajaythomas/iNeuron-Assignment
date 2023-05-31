package com.codewithajay.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 
 * Servlet that reads the name of the user from a form and displays a welcome message on the web page
 * @author Ajay Thomas
 *
 */
@WebServlet("/read-inputs")
public class WelcomApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				"            <h3> Hi "+request.getParameter("user_name")+" !! welcome to Ineuron </h3>" + 
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
