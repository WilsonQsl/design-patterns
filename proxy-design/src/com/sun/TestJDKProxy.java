package com.sun;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理主要有如下特点： 代理对象不需要实现目标对象的接口。
 * 代理对象的生成，使用的是Java的API，动态的在内存中构件代理对象(这需要我们指定创建代理对象/目标对象的接口的类型)。
 * 动态代理也叫做JDK代理、接口代理。
 */
public class TestJDKProxy {
	public static void main(String[] args) {
		// 目标对象
		RelanSubject userDao = new RelanSubject();
		// 原始类型 class com.sschen.proxy.UserDao
		System.out.println(userDao.getClass());
		// 给定目标对象，动态创建代理对象
		JdkSubject proxy = (JdkSubject) new ProxyFactory(userDao).getProxyInstance();
		// 代理对象类型 class com.sun.proxy.$Proxy0
		System.out.println(proxy.getClass());
		proxy.sing();
	}
}

// 目标接口
interface JdkSubject {
	public void sing();
}

// 目标对象
class RelanSubject implements JdkSubject {

	@Override
	public void sing() {
		System.out.println("唱歌");
	}

}

/**
 * 创建动态代理对象 动态代理对象不需要实现接口，但是需要指定接口类型
 */
class ProxyFactory {
	// 维护一个目标对象
	private Object target;

	// 对象构造时，提供目标对象
	public ProxyFactory(Object target) {
		this.target = target;
	}

	// 给目标对象生成代理对象
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("Begin Transaction");
						// 执行目标对象方法
						Object returnValue = method.invoke(target, args);
						System.out.println("Commit Transaction");
						return returnValue;
					}
				});
	}
}
/**
 * ClassLoader loader：指定当前目标对象使用类加载器，获取加载器的方法是固定的。 Class<?>[]
 * interfaces：目标对象实现的接口类型，使用泛型方式确认类型。 InvocationHandler
 * h：事件处理。执行目标对象的方法时，会触发事件处理器的方法，会把当前执行目标对象的方法作为参数传入。
 */