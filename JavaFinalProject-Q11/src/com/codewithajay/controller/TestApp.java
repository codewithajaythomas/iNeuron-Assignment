package com.codewithajay.controller;

import java.util.List;

import com.codewithajay.dto.Student;
import com.codewithajay.service.IStudentService;
import com.codewithajay.servicefactory.StudentServiceFactory;

public class TestApp {

	public static void main(String[] args) {

		IStudentService studentService = StudentServiceFactory.getStudentService();
		List<Student> students = studentService.searchStudent();
		
		System.out.println("------------------ Student List ----------------------");
		System.out.println("\nSID\tSNAME\tSAGE\tSADDR");

		if (students.isEmpty())
			System.out.println("Records found in student table.");
		else {
			for (Student std : students) {				
				System.out.println(std.getSid() + "\t" + std.getSname() + "\t" + std.getSage() + "\t" + std.getSaddress());
			}
		}
	}

}
