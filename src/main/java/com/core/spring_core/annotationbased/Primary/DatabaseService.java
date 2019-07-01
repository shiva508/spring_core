package com.core.spring_core.annotationbased.Primary;

public class DatabaseService {
private Dao dao;

public void setDao(Dao dao) {
	this.dao = dao;
}
public void getDatabaseService() {
	dao.databaseType();
}
}
