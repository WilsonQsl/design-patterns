package com.sun;

/**
 * 代理模式：https://www.cnblogs.com/qifengshi/p/6566752.html
 * 
 * 所谓代理模式是指客户端并不直接调用实际的对象，而是通过调用代理，来间接的调用实际的对象。
 * 
 * 案例：在现实生活中有很多歌手在同一个地方要举办演唱会，在举办演唱会的同时他们需要做三件事，准备演唱会，某某歌手唱歌，收场
 * 然而唱歌就是歌手需要做的，而且每个歌手的演唱方式都不同，因此可以定义一个唱歌的主题接口（Subject），具体的演唱细节
 * 交给歌手处理（真实主题类，实现Subject接口），但是举办演唱会需要委托工作人员（准备演唱会，收场）这里就需要一个代理类（ProxySubject）
 * 代理歌手做这两件事，
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
	// System.out.println("准备演唱会");
	// }

	public void sing() {
		System.out.println("华子唱歌");
	}

	// public void shutDowm() {
	// System.out.println("收场");
	// }
}

class AlanTam implements Subject {
	// public void prepare() {
	// System.out.println("准备演唱会");
	// }

	public void sing() {
		System.out.println("Jack唱歌");
	}

	// public void shutDowm() {
	// System.out.println("收场");
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
		System.out.println("准备演唱会");
	}

	public void shutDowm() {
		System.out.println("收场");
	}

	public void make() {
		this.prepare();
		this.subject.sing();
		this.shutDowm();

	}
}