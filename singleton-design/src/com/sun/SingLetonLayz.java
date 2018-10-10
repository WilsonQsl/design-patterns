package com.sun;

/**
 * ���� 
 * 1������һ����̬��������� 
 * 2��дһ����̬�����ж������Ƿ�Ϊ�գ����Ϊ�գ���new һ���������
 * 3������һ�������ȥ
 * 4���̲߳���ȫ�ģ��ڶ��̲߳������²���ʹ��
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
 * ȱ�㣺Ч��̫���ˣ�ÿ���߳����������ʵ��ʱ��ִ��getInstance()������Ҫ����ͬ���� �ŵ㣺�̰߳�ȫ
 * 
 * @author Administrator
 *
 */
class SingLetonLayzA {
	private static SingLetonLayzA singLetonLayz;

	private SingLetonLayzA() {
	}

	// ��ֹ���̵߳�ʱ��Ҫ����synchronized
	public static synchronized SingLetonLayzA getIntance() {
		if (singLetonLayz == null) {
			singLetonLayz = new SingLetonLayzA();
		}
		return singLetonLayz;
	}
}

/**
 * ˫�ؼ��[�Ƽ���]
 * 
 * @author Administrator
 *
 */
class SingLetonLayzB {
	private static SingLetonLayzB singLetonLayz;

	private SingLetonLayzB() {
	}

	// ��ֹ���̵߳�ʱ��Ҫ����synchronized
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
 * ��̬�ڲ���[�Ƽ���]
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
 * ö��[�Ƽ���]
 * 
 * @author Administrator
 *
 */
enum SingletonD {
	INSTANCE;
	public void whateverMethod() {

	}
}
