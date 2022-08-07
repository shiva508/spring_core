package com.core.spring_core.step1.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("PointA is (" + pointA.getX() + ", " + pointA.getY() + ")");
		System.out.println("PointB is (" + pointB.getX() + ", " + pointB.getY() + ")");
		System.out.println("PointC is (" + pointC.getX() + ", " + pointC.getY() + ")");
	}

	public void setBeanName(String name) {

	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}

}
