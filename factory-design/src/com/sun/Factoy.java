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
	public void eat() {
		System.out.println("С��Ҫ�Է�");
	}

	public void study() {
		System.out.println("С��Ҫ�õ���");
	}

	public void play() {
		System.out.println("С��Ҫ��ȥ��");
	}
}

class Student1 implements Student {
	public void eat() {
		System.out.println("С��Ҫ�Է�");
	}

	public void study() {
		System.out.println("С��Ҫ�õ���");
	}

	public void play() {
		System.out.println("С��Ҫ��ȥ��");
	}
}

interface Student {
	public void eat();

	public void study();

	public void play();
}