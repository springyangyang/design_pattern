package com.sgy.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		DefaultFactory factory = new DefaultFactory();
		System.out.println(factory.getCar().getName());
		System.out.println(factory.getCar("benz").getName());
	}

}
