package com.sun;
/**
 * ����ģʽ��
 * �����кܶ���С��һ��ִ����Щ�������ͻ�ͻᵼ�ºܶ���ͬ�ṹ�Ĵ���
 * С����С�����Ϊһ�������´���Ľṹ˵�Ǹ�һ��
 * �����һ����ķ�����
 * ����һ�������ࣺ�ѹ��е���Ϊ������һ������������
 * 
 */
public class TestFactoy {
	public static void main(String[] args) {
		// //�����Զ���С��
		// Student0 stu = new Student0();
		// stu.eat();
		// stu.study();
		// stu.play();
		// //��������С��
		// Student1 stu1 = new Student1();
		// stu1.eat();
		// stu1.study();
		// stu1.play();

		//student.class�Ĳ������ֽ���
		Student stu1 = Factoy.getIntance(Student0.class);

		stu1.eat();
		stu1.study();
		stu1.play();
	}
}
