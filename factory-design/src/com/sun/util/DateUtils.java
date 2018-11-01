package com.sun.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	/**
	 * 获取当前时间的年，月，日
	 * @return 返回的格式：2018-11-01
	 */
	public static String getCurrentDate() {
		LocalDate localdate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String curDate = formatter.format(localdate);
		return curDate;
	}
	/**
	 * 获取当前时间的年，月，日，时，分，秒
	 * @return 返回格式：2018-11-01 14:11:28
	 */
	public static String getCurrentTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:SS");
		String curTime = formatter.format(localDateTime);
		return curTime;
	}
	/**
	 * 获取时，分，秒
	 * @return 返回格式：15:43:48
	 */
	public static String getTime(){
		String time = LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond();
		return time;
	}
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now().getDayOfWeek());
	}
}
