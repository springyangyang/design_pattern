package com.sgy.pattern.singleton.lazypattern;
/**
 * 懒汉式
 * @author sgy
 *解决了安全问题，又解决了性能问题
 */
public class LazySingleton {
	//1.声明一个静态内部类
	//private保证别人无法修改
	//static保证全局唯一
	private static class LazyHolder{
		//final防止内部误操作，使用cglib的代理模式误操作
		private static final LazySingleton INSTANCE = new LazySingleton();
	}
	//2.将默认构造方法私有化
	private LazySingleton(){}
	
	//3.提供静态方法获取实例
	//final 确保别人无法覆盖此方法
	public static final LazySingleton getInstance(){
		//方法中的逻辑是要在用户调用的时候才开始执行
		//方法中实现逻辑需要分配内存，也就是调用时才分配
		return LazyHolder.INSTANCE;
	}

}
