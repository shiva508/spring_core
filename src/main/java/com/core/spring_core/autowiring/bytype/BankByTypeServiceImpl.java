package com.core.spring_core.autowiring.bytype;

import java.util.List;

import com.core.spring_core.autowiring.Bank;

public class BankByTypeServiceImpl implements BankByTypeService {

	private BankByTypeDao bankByTypeDao;

	public BankByTypeDao getBankByTypeDao() {
		return bankByTypeDao;
	}

	public void setBankByTypeDao(BankByTypeDao bankByTypeDao) {
		this.bankByTypeDao = bankByTypeDao;
	}

	public List<Bank> getBanks() {
		return bankByTypeDao.getBanks();
	}

	public List<Bank> addBank(Bank bank) {
		return bankByTypeDao.addBank(bank);
	}

}
