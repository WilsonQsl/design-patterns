package com.sun;

/**
 * ����ʽ
 * �ŵ㣺����д���Ƚϼ򵥣���������װ�ص�ʱ������ʵ�������������߳�ͬ������
 * ȱ�㣺����װ�ص�ʱ������ʵ������û�дﵽLazy Loading��Ч��,�����ʼ���մ�δʹ�ù����ʵ�����������ڴ���˷ѡ�
 * @author Administrator
 *
 */
public class SingLeton {
	private final static SingLeton singLeton = new SingLeton();

	private SingLeton() {

	}

	public static SingLeton getInstance() {
		return singLeton;
	}
}
