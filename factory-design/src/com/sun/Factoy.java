package com.sun;

public class Factoy {
	public static Student getIntance(Class<?> className) {
		try {
			return (Student) className.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}

class Student0 implements Student {
	@Override
	public void eat() {
		System.out.println("小明要吃饭");
	}
	@Override
	public void study() {
		System.out.println("小明要用电脑");
	}
	@Override
	public void play() {
		System.out.println("小明要出去玩");
	}
}

class Student1 implements Student {
	@Override
	public void eat() {
		System.out.println("小红要吃饭");
	}
	@Override
	public void study() {
		System.out.println("小红要用电脑");
	}
	@Override
	public void play() {
		System.out.println("小红要出去玩");
	}
}

interface Student {
	public void eat();

	public void study();

	public void play();
}