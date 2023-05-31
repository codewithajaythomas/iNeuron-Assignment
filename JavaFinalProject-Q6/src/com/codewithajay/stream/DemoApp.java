package com.codewithajay.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoApp {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(25,10,15,20,35,5,40,30);
		
		System.out.println(numbers.stream()
				.sorted((a,b)->a-b) // [5, 10, 15, 20, 25, 30, 35, 40]			
				.map(a -> a/5) // [1, 2, 3, 4, 5, 6, 7, 8]
				.filter(a->a>5) // [6, 7, 8]
				.collect(Collectors.toList()));
	}
}
