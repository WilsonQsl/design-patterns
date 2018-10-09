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

class HZ implements Subject {
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

class Jack implements Subject {
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

interface Subject {
	public void sing();
}

class ProxySubject {
	public Subject subject;

	public ProxySubject(Subject subject) {
		this.subject = subject;
	}

	public void prepare() {
		System.out.println("׼������");
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