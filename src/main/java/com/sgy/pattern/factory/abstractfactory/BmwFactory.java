package com.sgy.pattern.factory.abstractfactory;

import com.sgy.pattern.factory.Bmw;
import com.sgy.pattern.factory.Car;

public class BmwFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		return new Bmw();
	}

}
