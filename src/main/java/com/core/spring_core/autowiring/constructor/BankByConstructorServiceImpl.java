package com.core.spring_core.autowiring.constructor;

import java.util.List;

import com.core.spring_core.autowiring.Bank;

public class BankByConstructorServiceImpl implements BankByConstructorService {

	private BankByConstructorDao bankByConstructorDao;

	
	public BankByConstructorServiceImpl(BankByConstructorDao bankByConstructorDao) {
		this.bankByConstructorDao = bankByConstructorDao;
	}

	public List<Bank> getBanks() {
		return bankByConstructorDao.getBanks();
	}

	public List<Bank> addBank(Bank bank) {
		return bankByConstructorDao.addBank(bank);
	}

}
