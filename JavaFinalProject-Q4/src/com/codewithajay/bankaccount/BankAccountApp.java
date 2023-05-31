package com.codewithajay.bankaccount;

import java.util.Scanner;

public class BankAccountApp {

		public static void main(String[] args) throws NegativeNumberException {
			
			int service = 0;
			float amount = 0f;
			
			Account account = null;
			Scanner scan = null;
			
			try {
				
				account = new SavingsAccount();
				scan = new Scanner(System.in);
				
				while(true) {
					
					System.out.println("\n--------------- Welcome to ABCD Bank ---------------");
					System.out.println("1. Deposite cash");
					System.out.println("2. Withdraw cash");
					System.out.println("3. Check balance");
					System.out.println("0. Exit");
					System.out.println("Please select the requied service : ");
					
					service = scan.nextInt();
					
					if(service == 1) {
						System.out.println("Enter the deposite amount : ");			
						amount = scan.nextFloat();
						
						if(amount > 0)
							System.out.println(account.deposit(amount));
						else
							throw new NegativeNumberException("The amount you have entered is invalid. Please visit again.");
						
					}else if(service == 2) {
						
						System.out.println("Enter the withdrawal amount : ");			
						amount = scan.nextFloat();
						
						if(amount > 0)
							System.out.println(account.withdraw(amount));
						else
							throw new NegativeNumberException("The amount you have entered is invalid. Please visit again.");
						
					}else if(service == 3) {
						
						System.out.println(account.getBalance());
						
					}else {
						System.out.println("Thank you visit again.");
						break;				
					}					
				}			
				
			}catch(NegativeNumberException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("Something went wrong. Please visit again.");
			}finally {
				if(scan != null)
					scan.close();
			}
					
		}
}
