package com.core.spring_core.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBased {
List<String> bankList;
Map<Integer, String> bankMap;
Set<String> bankSet;
Properties bankProperties;
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
@Override
public String toString() {
	return "CollectionBased [bankList=" + bankList + ", bankMap=" + bankMap + ", bankSet=" + bankSet
			+ ", bankProperties=" + bankProperties + "]";
}


}
