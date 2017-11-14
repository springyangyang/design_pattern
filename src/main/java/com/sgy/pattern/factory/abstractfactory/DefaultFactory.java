package com.sgy.pattern.factory.abstractfactory;

import com.sgy.pattern.factory.Car;
import com.sgy.pattern.factory.function.AudiFactory;
//默认工厂
public class DefaultFactory extends AbstractFactory{
	private AudiFactory factory = new AudiFactory();
	@Override
	protected Car getCar() {
		return factory.getCar();
	}

}
