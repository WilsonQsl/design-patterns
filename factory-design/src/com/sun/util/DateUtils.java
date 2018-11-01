package com.sun.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	/**
	 * ��ȡ��ǰʱ����꣬�£���
	 * @return ���صĸ�ʽ��2018-11-01
	 */
	public static String getCurrentDate() {
		LocalDate localdate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String curDate = formatter.format(localdate);
		return curDate;
	}
	/**
	 * ��ȡ��ǰʱ����꣬�£��գ�ʱ���֣���
	 * @return ���ظ�ʽ��2018-11-01 14:11:28
	 */
	public static String getCurrentTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:SS");
		String curTime = formatter.format(localDateTime);
		return curTime;
	}
	/**
	 * ��ȡʱ���֣���
	 * @return ���ظ�ʽ��15:43:48
	 */
	public static String getTime(){
		String time = LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond();
		return time;
	}
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now().getDayOfWeek());
	}
}
