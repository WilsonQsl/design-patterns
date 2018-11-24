package com.sun;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬������Ҫ�������ص㣺 ���������Ҫʵ��Ŀ�����Ľӿڡ�
 * �����������ɣ�ʹ�õ���Java��API����̬�����ڴ��й����������(����Ҫ����ָ�������������/Ŀ�����Ľӿڵ�����)��
 * ��̬����Ҳ����JDK�����ӿڴ���
 */
public class TestJDKProxy {
	public static void main(String[] args) {
		// Ŀ�����
		RelanSubject userDao = new RelanSubject();
		// ԭʼ���� class com.sschen.proxy.UserDao
		System.out.println(userDao.getClass());
		// ����Ŀ����󣬶�̬�����������
		JdkSubject proxy = (JdkSubject) new ProxyFactory(userDao).getProxyInstance();
		// ����������� class com.sun.proxy.$Proxy0
		System.out.println(proxy.getClass());
		proxy.sing();
	}
}

// Ŀ��ӿ�
interface JdkSubject {
	public void sing();
}

// Ŀ�����
class RelanSubject implements JdkSubject {

	@Override
	public void sing() {
		System.out.println("����");
	}

}

/**
 * ������̬������� ��̬���������Ҫʵ�ֽӿڣ�������Ҫָ���ӿ�����
 */
class ProxyFactory {
	// ά��һ��Ŀ�����
	private Object target;

	// ������ʱ���ṩĿ�����
	public ProxyFactory(Object target) {
		this.target = target;
	}

	// ��Ŀ��������ɴ������
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("Begin Transaction");
						// ִ��Ŀ����󷽷�
						Object returnValue = method.invoke(target, args);
						System.out.println("Commit Transaction");
						return returnValue;
					}
				});
	}
}
/**
 * ClassLoader loader��ָ����ǰĿ�����ʹ�������������ȡ�������ķ����ǹ̶��ġ� Class<?>[]
 * interfaces��Ŀ�����ʵ�ֵĽӿ����ͣ�ʹ�÷��ͷ�ʽȷ�����͡� InvocationHandler
 * h���¼�����ִ��Ŀ�����ķ���ʱ���ᴥ���¼��������ķ�������ѵ�ǰִ��Ŀ�����ķ�����Ϊ�������롣
 */
