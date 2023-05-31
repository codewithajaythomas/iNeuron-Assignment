package com.codewithajay.threads;

public class DemoApp {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> {
			for(int i=1;i<=10;i++) {
				if(i%2==0)
					System.out.println("T1 - "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for(int i=1;i<=10;i++) {
				if(i%2!=0)
					System.out.println("T2 - "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		thread1.start();
		thread2.start();
	}	
}
