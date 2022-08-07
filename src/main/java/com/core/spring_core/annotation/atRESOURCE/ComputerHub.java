package com.core.spring_core.annotation.atRESOURCE;

import javax.annotation.Resource;

public class ComputerHub {
	
	@Resource(name = "accerComputer")
	private Computer computer;
	public void writeProgram(String programName) {
		computer.writeProgram(programName);
	}
}
