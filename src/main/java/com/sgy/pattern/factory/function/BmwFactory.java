package com.sgy.pattern.factory.function;

import com.sgy.pattern.factory.Bmw;
import com.sgy.pattern.factory.Car;

public class BmwFactory implements Factory{

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
