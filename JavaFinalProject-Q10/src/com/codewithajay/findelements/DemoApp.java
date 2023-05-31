package com.codewithajay.findelements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		
		String inputValues="";
		int number=0,size=0,secondSmallest=0,secondLargest=0;
		
		List<Integer> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a set of integers : ");
		inputValues = scan.nextLine();
		
		for(String value : inputValues.split(" ")) {
			number = Integer.parseInt(value);
			list.add(number);
		}
		
		if(!list.isEmpty()) {
			
			size = list.size();
			list.sort((a,b)-> a-b);
			System.out.println(list);
			
			if(size==1)
				secondSmallest=secondLargest=list.get(0);
			else {
				secondLargest = list.get(size-2);
				secondSmallest = list.get(1);
			}
			
			System.out.println("Second largest : " + secondLargest);
			System.out.println("Second samllest : "+ secondSmallest);
				
		}else {
			System.out.println("No input found");
		}

		
	}

}
