package com.sgy.pattern.factory.function;

import com.sgy.pattern.factory.Car;
//工厂接口，定义了所有工厂的执行标准
public interface Factory {
	Car getCar();

}
