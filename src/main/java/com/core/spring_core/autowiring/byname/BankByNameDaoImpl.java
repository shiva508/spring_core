package com.core.spring_core.autowiring.byname;

import java.util.ArrayList;
import java.util.List;

import com.core.spring_core.autowiring.Bank;

public class BankByNameDaoImpl implements BankByNameDao {

	public static List<Bank> bankLIst = new ArrayList<Bank>();
	static {
		bankLIst.add(new Bank(508, "Telangana"));
	}

	public List<Bank> getBanks() {

		return bankLIst;
	}

	public List<Bank> addBank(Bank bank) {
		bankLIst.add(bank);
		return bankLIst;
	}

}
