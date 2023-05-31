package com.codewithajay.producer_cosumer;

import java.util.PriorityQueue;

public class DemoApp {
	
	public static void main(String[] args) {
		
		QueueList queue = new QueueList(new PriorityQueue<Integer>());
		
		Thread t1 = new Thread(()->{
			int number = 0;
			while(number!=100) {
				number = (int) Math.ceil(Math.random()*100);
				queue.getQueue().add(number);
				System.out.println("Queue : "+queue.getQueue());
			}
			
		}); 
		
		Thread t2 = new Thread(()->{
			int sum = 0;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(queue.getQueue().size()>0) {
				sum += queue.getQueue().poll();
				System.out.println("Current Sum : "+ sum);
			}			
		});
		
		t1.start();
		t2.start();
	}
}
