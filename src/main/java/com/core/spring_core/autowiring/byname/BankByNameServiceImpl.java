package com.core.spring_core.autowiring.byname;

import java.util.List;

import com.core.spring_core.autowiring.Bank;

public class BankByNameServiceImpl implements BankByNameService {

	private BankByNameDao bankByNameDao;
	
	
	
	public BankByNameDao getBankByNameDao() {
		return bankByNameDao;
	}

	public void setBankByNameDao(BankByNameDao bankByNameDao) {
		this.bankByNameDao = bankByNameDao;
	}

	public List<Bank> getBanks() {
		return bankByNameDao.getBanks();
	}

	public List<Bank> addBank(Bank bank) {
		return bankByNameDao.addBank(bank);
	}
	
}
