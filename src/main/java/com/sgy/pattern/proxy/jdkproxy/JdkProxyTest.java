package com.sgy.pattern.proxy.jdkproxy;

public class JdkProxyTest {
	public static void main(String[] args) {
		//获取被代理人个人信息
		Person obj = (Person) new YueLao().getInstance(new Tony());
		obj.findLove();
	}

}
