package com.codewithajay.exceptionhandling;

import java.util.Scanner;

public class DemoApp {
	
	public static void main(String[] args) {
		
		int value = 0;
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number: ");
			value = scan.nextInt();
			scan.close();
			
			if(value<0)
				throw new NegativeNumberException("The number you have entered is a negative number."); 
			else
				System.out.println("You have entered "+value);
			
		}catch (NegativeNumberException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
