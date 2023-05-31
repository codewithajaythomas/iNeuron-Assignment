package com.codewithajay.bankaccount;

public class SavingsAccount implements Account {
	
	private float money;

	@Override
	public String deposit(float amount) {
		money += amount;
		return "Successfully deposited Rs. "+amount;
	}

	@Override
	public String withdraw(float amount) {
		
		if(money < amount)
			return "No enough balance to withdraw Rs. "+amount;
		else
			money -= amount;
		
		return "Successfully withdrawn Rs. "+ amount;
	}

	@Override
	public String getBalance() {
		return "Your current bank balance is Rs. "+ money;
	}

}
