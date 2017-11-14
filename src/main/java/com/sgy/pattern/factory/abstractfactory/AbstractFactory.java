package com.sgy.pattern.factory.abstractfactory;

import com.sgy.pattern.factory.Car;
import com.sgy.pattern.factory.function.AudiFactory;
import com.sgy.pattern.factory.function.BenzFactory;
import com.sgy.pattern.factory.function.BmwFactory;

public abstract class AbstractFactory {
	protected abstract Car getCar();
	
	public Car getCar(String name){
		
		if ("bmw".equalsIgnoreCase(name)) {
			return new BmwFactory().getCar();
		}else if ("benz".equalsIgnoreCase(name)) {
			return new BenzFactory().getCar();
		}else if ("Audi".equalsIgnoreCase(name)) {
			return new AudiFactory().getCar();
		}else{
			System.out.println("无法生产。。。");
			return null;
		}
	}

}
