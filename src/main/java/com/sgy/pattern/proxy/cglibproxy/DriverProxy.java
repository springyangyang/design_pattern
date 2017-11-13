package com.sgy.pattern.proxy.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
/**
 * 代驾
 * @author sgy
 *
 */
public class DriverProxy implements MethodInterceptor{
	public Object getInstance(Class clazz){
		Enhancer enhancer = new Enhancer();
		//这一步是告诉cglib，生成的子类要继承哪个类
		enhancer.setSuperclass(clazz);
		//设置回调
		enhancer.setCallback(this);
		//这一步执行的操作包括：
		//1.生成源代码
		//2.编译成class文件
		//3.加载到JVM中，并返回被代理对象
		return enhancer.create();
	}
	
	//字节码重组,对于使用API的用户来说是无感知的
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("我是代驾，有合法的代驾资格，您喝醉了需要我代驾");
		System.out.println("代驾旅程开始。。。。");
		System.out.println("======================");
		//这个obj的引用是cglib给我们new出来的
		//cglib new出来的对象，是被代理对象的子类(继承了我们自己写的那个类jack.java)
		//子类重写了父类的所有方法
		//我们改变子类对象的某些属性，是可以间接的操作父类的属性的
		proxy.invokeSuper(obj, args);
		System.out.println("================");
		System.out.println("代驾旅程结束。。。。");
		return null;
	}

}
