package com.sun;

import com.sun.vo.Enginner;
import com.sun.vo.Persion;

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
		Persion enginner = new Enginner();
	}
}
