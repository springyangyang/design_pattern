package com.sgy.pattern.factory.function;

import com.sgy.pattern.factory.Audi;
import com.sgy.pattern.factory.Car;

public class AudiFactory implements Factory{
	@Override
	public Car getCar() {
		return new Audi();
	}
}
