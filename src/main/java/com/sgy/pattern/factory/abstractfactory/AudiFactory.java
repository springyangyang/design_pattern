package com.sgy.pattern.factory.abstractfactory;

import com.sgy.pattern.factory.Audi;
import com.sgy.pattern.factory.Car;

public class AudiFactory extends AbstractFactory{

	@Override
	protected Car getCar() {
		return new Audi();
	}

}
