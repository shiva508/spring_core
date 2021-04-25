package com.core.spring_core.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogBean {
	private static Log log = LogFactory.getLog(LogBean.class);

	public void logDetails() {
		log.info("Hi! Dude!");
	}
}
