package com.sun;
/*
 * 单列模式：
 * 如果在一次程序中的或者在一个容器中控制某个类的对象只能实例化一次，此时就需要使用单例模式实现，
 * 单例有两种模式：懒汉式，饿汉式
 * 单例模式原则是：
 * 构造函数是私有的
 * 对象是静态的成员变量
 * 因此只需要加载一次
 */
public class Test {
	public static void main(String [] args){
		System.out.println(SingLetonLayzB.getIntance());
		System.out.println(SingLetonLayzB.getIntance());
		//System.out.println(SingLetonLayzB.getIntance());
	}
}
