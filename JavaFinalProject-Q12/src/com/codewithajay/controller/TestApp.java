package com.codewithajay.controller;

import java.util.Scanner;

import com.codewithajay.dto.Student;
import com.codewithajay.service.IStudentService;
import com.codewithajay.servicefactory.StudentServiceFactory;

public class TestApp {

	public static void main(String[] args) {

		selectOperation();

	}

	private static void selectOperation() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the student id :: ");
		int sid = scanner.nextInt();

		IStudentService studentService = StudentServiceFactory.getStudentService();
		Student std = studentService.searchStudent(sid);
		if (std != null) {
			System.out.println("SID\tSNAME\tSAGE\tSADDR");
			System.out.println(std.getSid() + "\t" + std.getSname() + "\t" + std.getSage() + "\t" + std.getSaddress());
		} else {
			System.out.println("Record not found for the given id :: " + sid);
		}

		scanner.close();
	}

	@SuppressWarnings("unused")
	private static void insertOperation() {
		IStudentService studentService = StudentServiceFactory.getStudentService();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the student name :: ");
		String sname = scanner.next();

		System.out.print("Enter the student age :: ");
		int sage = scanner.nextInt();

		System.out.print("Enter the student addres :: ");
		String saddress = scanner.next();

		String msg = studentService.addStudent(sname, sage, saddress);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("record inserted succesfully");
		} else {
			System.out.println("record insertion failed....");
		}

		scanner.close();
	}
	
	@SuppressWarnings("unused")
	private static void updateRecord() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the student id to be updated:: ");
		int sid = scanner.nextInt();

		IStudentService studentService = StudentServiceFactory.getStudentService();
		
		Student std = studentService.searchStudent(sid);
		if (std != null) {

			System.out.println("SID\tSNAME\tSAGE\tSADDR");
			System.out.println(std.getSid() + "\t" + std.getSname() + "\t" + std.getSage() + "\t" + std.getSaddress());
			System.out.println("\nEnter new details: ");
			System.out.print("\nEnter Name: ");
			String sname = scanner.next();
			System.out.print("Enter Age: ");
			int sage = scanner.nextInt();
			System.out.print("Enter Address: ");
			String saddress = scanner.next();
			
			String msg = studentService.updateStudent(sid, sname, sage, saddress);
			
			if (msg.equalsIgnoreCase("success")) {
				System.out.println("record updated succesfully");
			} else if (msg.equalsIgnoreCase("not found")) {
				System.out.println("record not avilable for the given id ::" + sid);
			} else {
				System.out.println("record updation failed....");
			}
			
		} else {
			System.out.println("Record not found for the given id :: " + sid);
		}
		
		scanner.close();
	}
	
	@SuppressWarnings("unused")
	private static void deleteRecord() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the student id to be deleted:: ");
		int sid = scanner.nextInt();

		IStudentService studentService = StudentServiceFactory.getStudentService();
		String msg = studentService.deleteStudent(sid);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("record deleted succesfully");
		} else if (msg.equalsIgnoreCase("not found")) {
			System.out.println("record not avilable for the given id ::" + sid);
		} else {
			System.out.println("record deletion failed....");
		}

		scanner.close();
	}

}
