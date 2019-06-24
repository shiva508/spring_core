package com.core.spring_core.autowiring.bytype;

import java.util.List;

import com.core.spring_core.autowiring.Bank;

public interface BankByTypeService {
	public List<Bank> getBanks();

	public List<Bank> addBank(Bank bank);
}
