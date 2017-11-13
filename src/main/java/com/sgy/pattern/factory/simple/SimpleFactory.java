package com.sgy.pattern.factory.simple;

import com.sgy.pattern.factory.Audi;
import com.sgy.pattern.factory.Benz;
import com.sgy.pattern.factory.Bmw;
import com.sgy.pattern.factory.Car;
/**
 * 简单工厂模式
 * @author sgy05
 *
 */
public class SimpleFactory {
	
	public Car getCar(String name ){
		if ("BMW".equalsIgnoreCase(name)) {
			return new Bmw();
		}else if("Benz".equalsIgnoreCase(name)){
			return new Benz();
		}else if ("Audi".equalsIgnoreCase(name)) {
			return new Audi();
		}else{
			System.out.println("这个品牌类型的 车不生产");
			return null;
		}
	}

}
