package com.sgy.pattern.factory.abstractfactory;

import com.sgy.pattern.factory.Benz;
import com.sgy.pattern.factory.Car;

public class BenzFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		return new Benz();
	}

}
