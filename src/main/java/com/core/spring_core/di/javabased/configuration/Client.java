package com.core.spring_core.di.javabased.configuration;

public class Client {
private DataSourceBean dataSourceBean;

public Client(DataSourceBean dataSourceBean) {
	this.dataSourceBean = dataSourceBean;
}

public void myClintDatabaseBean() {
	System.out.println("I AM CLIENT USING DATABASE OF ");
	dataSourceBean.myDatabaseInstance();
}
}
