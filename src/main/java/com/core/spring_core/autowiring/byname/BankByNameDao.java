package com.core.spring_core.autowiring.byname;

import java.util.List;

import com.core.spring_core.autowiring.Bank;

public interface BankByNameDao {
public List<Bank> getBanks();

public List<Bank> addBank(Bank bank);


}
