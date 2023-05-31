package com.codewithajay.bankaccount;

public interface Account {

	String deposit(float amount);
	String withdraw(float amount);
	String getBalance();
}
