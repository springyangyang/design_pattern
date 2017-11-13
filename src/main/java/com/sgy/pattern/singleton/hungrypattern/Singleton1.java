package com.sgy.pattern.singleton.hungrypattern;
/**
 * 饿汉式
 * @author sgy
 *饿汉式单例类，在类初始化时，已经自行实例化
 */
public class Singleton1 {
	//1.将默认构造方法私有化
	private Singleton1(){}
	
	//2.声明静态变量，在类实例化之前就初始化变量，将对象引用保存
	private static final Singleton1 single = new Singleton1();
	//3.提供静态方法，获取实例
	public Singleton1 getInstance(){
		
		return single;
	}
}
//饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。