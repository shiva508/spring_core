package com.core.spring_core.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.core.spring_core.di.Account;

public class CollectionBased {
List<String> bankList;
Map<Integer, String> bankMap;
Set<String> bankSet;
Properties bankProperties;
Map<String, List<String>> accoumntMap;
public List<String> getBankList() {
	return bankList;
}
public void setBankList(List<String> bankList) {
	this.bankList = bankList;
}
public Map<Integer, String> getBankMap() {
	return bankMap;
}
public void setBankMap(Map<Integer, String> bankMap) {
	this.bankMap = bankMap;
}
public Set<String> getBankSet() {
	return bankSet;
}
public void setBankSet(Set<String> bankSet) {
	this.bankSet = bankSet;
}
public Properties getBankProperties() {
	return bankProperties;
}
public void setBankProperties(Properties bankProperties) {
	this.bankProperties = bankProperties;
}

public Map<String, List<String>> getAccoumntMap() {
	return accoumntMap;
}
public void setAccoumntMap(Map<String, List<String>> accoumntMap) {
	this.accoumntMap = accoumntMap;
}
@Override
public String toString() {
	return "CollectionBased [bankList=" + bankList + ", bankMap=" + bankMap + ", bankSet=" + bankSet
			+ ", bankProperties=" + bankProperties + "]";
}


}
