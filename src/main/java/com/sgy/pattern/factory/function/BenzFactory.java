package com.sgy.pattern.factory.function;

import com.sgy.pattern.factory.Benz;
import com.sgy.pattern.factory.Car;

public class BenzFactory implements Factory{

	@Override
	public Car getCar() {
		return new Benz();
	}

}
