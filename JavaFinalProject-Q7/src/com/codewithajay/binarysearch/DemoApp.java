package com.codewithajay.binarysearch;

import java.util.Scanner;

public class DemoApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = {5,10,15,20,25,30,35,40,45,50};
		int value = 0,start=0,end=0;
		
		System.out.println("------------------------ Binary Search -----------------------");
		System.out.println("Enter an number : ");
		value = scan.nextInt();
		
		end = array.length-1;
		
		int mid = array.length/2;
			  
		while( start <= end ){  
		      if (array[mid] < value ){  
		    	  start = mid + 1;     
		      }else if (array[mid] == value){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		    	  end = mid - 1;  
		      }  
		      
		      mid = (start + end)/2;  
		 }
		
		 if (start > end){  
		      System.out.println("Element is not found!");  
		 }  
		
	}
}
