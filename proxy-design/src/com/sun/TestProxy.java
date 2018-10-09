package com.sun;

public class TestProxy {
	public static void main(String[] args) {
		// HZ hz = new HZ();
		// hz.prepare();
		// hz.sing();
		// hz.shutDowm();
		new ProxySubject(new Jack()).make();
	}
}

class HZ implements Proxy {
	// public void prepare() {
	// System.out.println("׼������");
	// }

	public void sing() {
		System.out.println("���ӳ���");
	}

	// public void shutDowm() {
	// System.out.println("�ճ�");
	// }
}

class Jack implements Proxy {
	// public void prepare() {
	// System.out.println("׼������");
	// }

	public void sing() {
		System.out.println("Jack����");
	}

	// public void shutDowm() {
	// System.out.println("�ճ�");
	// }
}

interface Proxy {
	public void sing();
}

class ProxySubject {
	public Proxy proxy;

	public ProxySubject(Proxy proxy) {
		this.proxy = proxy;
	}

	public void prepare() {
		System.out.println("׼������");
	}

	public void shutDowm() {
		System.out.println("�ճ�");
	}

	public void make() {
		this.prepare();
		this.proxy.sing();
		this.shutDowm();
		
		
	}
}