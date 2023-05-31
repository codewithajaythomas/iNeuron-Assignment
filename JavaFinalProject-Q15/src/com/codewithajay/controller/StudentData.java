package com.codewithajay.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codewithajay.dto.Student;
import com.codewithajay.service.IStudentService;
import com.codewithajay.servicefactory.StudentServiceFactory;


@WebServlet("/DisplayAllStudents")
public class StudentData extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		IStudentService studentService = StudentServiceFactory.getStudentService();
		List<Student> students = studentService.searchStudent();
		String data ="";
	
		if (students.isEmpty())
			data = "<tr><td colspan=4>No Records found in student table</td></tr>"; 
		else {
			for (Student std : students) {				
				data  += "<tr>"
						+ "<td>"+std.getSid()+"</td>"
						+ "<td>"+std.getSname()+"</td>"
						+ "<td>"+std.getSage()+"</td>"
						+ "<td>"+std.getSaddress()+"</td>"
						+ "</tr>"; 
			}
		}
		
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
				"        <div class=\"card-body\">\r\n" + 
				"          <table class=\"table table-dark table-striped mb-0\">\r\n" + 
				"            <thead>\r\n" + 
				"              <tr>\r\n" + 
				"                <th>Id</th>\r\n" + 
				"                <th>Name</th>\r\n" + 
				"                <th>Age</th>\r\n" + 
				"                <th>Address</th>\r\n" + 
				"              </tr>\r\n" + 
				"            </thead>\r\n" + 
				"            <tbody>\r\n"
				+  			data      +	
				"            </tbody>\r\n" + 
				"          </table>\r\n" + 
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
	}

}
