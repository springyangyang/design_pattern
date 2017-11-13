package com.sgy.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 
 ** <p>Description:月老牵线搭桥 </p>
 * @author SGY
 */
public class YueLao implements InvocationHandler{
	//将被代理对象的个人信息用成员变量保存下来
	private Person target;
	//获取被代理人的个人资料信息
	public Object getInstance(Person target){
		this.target=target;
		Class clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}
	//invoke方法：在获取被代理对象信息后自动回调此方法
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("月老保媒：");
		System.out.println("根据条件开始进行选择。。。");
		System.out.println("========================");
		//调用被代理人方法
		method.invoke(this.target, args);
		System.out.println("==============================");
		System.out.println("选拔结束");
		return null;
	}

}
