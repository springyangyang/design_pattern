package com.sgy.pattern.proxy.jdkproxy;

/**
 * 
 * @author sgy
 * <p>Description:
 * 	满足代理模式的三个必要条件是：
 *    	1.需要两个角色：（1）执行者（即代理者）  （2）被代理对象
 * 		2.被代理对象必须做但没时间做，交给代理对象去做，重过程。
 * 		3.执行者也就是代理人必须获取到被代理对象的个人信息(代理对象持有被代理对象的引用)
 * 
 * </p>
 *
 */
public class JdkProxyTest {
	public static void main(String[] args) {
		//获取被代理人个人信息
		Person obj = (Person) new YueLao().getInstance(new Tony());
		obj.findLove();
	}

}
