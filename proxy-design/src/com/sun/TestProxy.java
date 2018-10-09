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
	// System.out.println("准备唱歌");
	// }

	public void sing() {
		System.out.println("华子唱歌");
	}

	// public void shutDowm() {
	// System.out.println("收场");
	// }
}

class Jack implements Proxy {
	// public void prepare() {
	// System.out.println("准备唱歌");
	// }

	public void sing() {
		System.out.println("Jack唱歌");
	}

	// public void shutDowm() {
	// System.out.println("收场");
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
		System.out.println("准备唱歌");
	}

	public void shutDowm() {
		System.out.println("收场");
	}

	public void make() {
		this.prepare();
		this.proxy.sing();
		this.shutDowm();
		
		
	}
}