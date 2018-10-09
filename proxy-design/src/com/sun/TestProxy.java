package com.sun;

/**
 * ����ģʽ��https://www.cnblogs.com/qifengshi/p/6566752.html
 * 
 * ��ν����ģʽ��ָ�ͻ��˲���ֱ�ӵ���ʵ�ʵĶ��󣬶���ͨ�����ô�������ӵĵ���ʵ�ʵĶ���
 * 
 * ����������ʵ�������кܶ������ͬһ���ط�Ҫ�ٰ��ݳ��ᣬ�ھٰ��ݳ����ͬʱ������Ҫ�������£�׼���ݳ��ᣬĳĳ���ֳ��裬�ճ�
 * Ȼ��������Ǹ�����Ҫ���ģ�����ÿ�����ֵ��ݳ���ʽ����ͬ����˿��Զ���һ�����������ӿڣ�Subject����������ݳ�ϸ��
 * �������ִ�����ʵ�����࣬ʵ��Subject�ӿڣ������Ǿٰ��ݳ�����Ҫί�й�����Ա��׼���ݳ��ᣬ�ճ����������Ҫһ�������ࣨProxySubject��
 * ����������������£�
 *
 */
public class TestProxy {
	public static void main(String[] args) {
		// HZ hz = new HZ();
		// hz.prepare();
		// hz.sing();
		// hz.shutDowm();
		new ProxySubject(new AndyLau()).make();
	}
}

class AndyLau implements Subject {
	// public void prepare() {
	// System.out.println("׼���ݳ���");
	// }

	public void sing() {
		System.out.println("���ӳ���");
	}

	// public void shutDowm() {
	// System.out.println("�ճ�");
	// }
}

class AlanTam implements Subject {
	// public void prepare() {
	// System.out.println("׼���ݳ���");
	// }

	public void sing() {
		System.out.println("Jack����");
	}

	// public void shutDowm() {
	// System.out.println("�ճ�");
	// }
}

interface Subject {
	public void sing();
}

class ProxySubject {
	public Subject subject;

	public ProxySubject(Subject subject) {
		this.subject = subject;
	}

	public void prepare() {
		System.out.println("׼���ݳ���");
	}

	public void shutDowm() {
		System.out.println("�ճ�");
	}

	public void make() {
		this.prepare();
		this.subject.sing();
		this.shutDowm();

	}
}