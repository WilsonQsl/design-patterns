package com.sun;
/**
 * 工厂模式：
 * 当我有很多像小明一样执行这些方法，就会就会导致很多相同结构的代码
 * 小明和小红的行为一样，导致代买的结构说那个一样
 * 解决这一问题的方法：
 * 创建一个工厂类：把共有的行为建立在一个工厂类里面
 * 
 */
public class TestFactoy {
	public static void main(String[] args) {
		// //创建对对象小明
		// Student0 stu = new Student0();
		// stu.eat();
		// stu.study();
		// stu.play();
		// //创建对象小红
		// Student1 stu1 = new Student1();
		// stu1.eat();
		// stu1.study();
		// stu1.play();

		//student.class的参数是字节码
		Student stu1 = Factoy.getIntance(Student0.class);

		stu1.eat();
		stu1.study();
		stu1.play();
	}
}
