package com.sun;

/**
 * 懒汉 
 * 1、声明一个静态的类的引用 
 * 2、写一个静态方法判断引用是否为空，如果为空，则new 一个对象给他
 * 3、返回一个对象回去
 * 4、线程不安全的，在多线程层的情况下不可使用
 */
public class SingLetonLayz {
	private static SingLetonLayz singLetonLayz;

	private SingLetonLayz() {
	}

	public static SingLetonLayz getIntance() {
		if (singLetonLayz == null) {
			singLetonLayz = new SingLetonLayz();
		}
		return singLetonLayz;
	}
}

/**
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。 优点：线程安全
 * 
 * @author Administrator
 *
 */
class SingLetonLayzA {
	private static SingLetonLayzA singLetonLayz;

	private SingLetonLayzA() {
	}

	// 防止多线程的时候要加上synchronized
	public static synchronized SingLetonLayzA getIntance() {
		if (singLetonLayz == null) {
			singLetonLayz = new SingLetonLayzA();
		}
		return singLetonLayz;
	}
}

/**
 * 双重检查[推荐用]
 * 
 * @author Administrator
 *
 */
class SingLetonLayzB {
	private volatile static SingLetonLayzB singLetonLayz;

	private SingLetonLayzB() {
	}

	// 防止多线程的时候要加上synchronized
	public static SingLetonLayzB getIntance() {
		if (singLetonLayz == null) {
			synchronized (SingLetonLayzB.class) {
				if (singLetonLayz == null) {
					singLetonLayz = new SingLetonLayzB();
				}
			}
		}
		return singLetonLayz;
	}
}

/**
 * 静态内部类[推荐用]
 * 
 * @author Administrator
 *
 */
class SingletonC {

	private SingletonC() {
	}

	private static class SingletonInstance {
		private static final SingletonC INSTANCE = new SingletonC();
	}

	public static SingletonC getInstance() {
		return SingletonInstance.INSTANCE;
	}
}

/**
 * 枚举[推荐用]
 * 
 * @author Administrator
 *
 */
enum SingletonD {
	INSTANCE;
	public void whateverMethod() {

	}
}
