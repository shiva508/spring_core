package com.core.spring_core.autowiring.constructor;

import java.util.List;

import com.core.spring_core.autowiring.Bank;

public interface BankByConstructorService {
	public List<Bank> getBanks();

	public List<Bank> addBank(Bank bank);
}
