package com.sgy.pattern.proxy.jdkproxy;

public class Tony implements Person{
	@Override
	public void findLove() {
		
		System.out.println("我是tony， 我要寻找真爱");
		System.out.println("择偶标准：");
		System.out.println("肤白貌美");
	}

}
