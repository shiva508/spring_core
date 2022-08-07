package com.core.spring_core.annotation.atIMPORT;

import org.springframework.beans.factory.annotation.Autowired;

public class ElasticSearchClient {

	@Autowired
	private ElasticSearchInstance elasticSearchInstance;
	
	public void getUserDetaisOnSeartch(){
		elasticSearchInstance.getUserDetails();
	}
}
