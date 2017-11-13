package com.sgy.pattern.factory.function;
/**
 * 工厂方法模式
 * 缺点：增加了代码复杂度
 * @author sgy05
 *
 */
public class FuncFactoryTest {
	public static void main(String[] args) {
		//工厂方法模式
		//各个产品的生产商，都拥有自己的工厂
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		System.out.println(factory.getCar().getName());
		
		factory = new BenzFactory();
		System.out.println(factory.getCar().getName());
		
	}
}
