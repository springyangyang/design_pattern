package com.sgy.pattern.factory.simple;

import com.sgy.pattern.factory.Car;

public class SimpleTest {
	
	public static void main(String[] args) {
		Car car = new SimpleFactory().getCar("audi");
		System.out.println("汽车品牌："+car.getName());
	}

}
