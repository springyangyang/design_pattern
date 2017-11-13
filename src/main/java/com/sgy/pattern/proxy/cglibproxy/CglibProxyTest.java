package com.sgy.pattern.proxy.cglibproxy;
/**
 * cglib动态代理测试类
 * @author sgy
 *
 */
public class CglibProxyTest {
	//JDK的动态代理是通过接口进行强制转换的
	//生成以后的代理对象，可以强制转换为接口
	
	
	//而cglib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
	//生成以后的对象，可以强制转换为被代理对象
	//子类引用赋值给父类
	public static void main(String[] args) {
		Jack obj = (Jack) new DriverProxy().getInstance(Jack.class);
		
		obj.driverCar();
	}

}
