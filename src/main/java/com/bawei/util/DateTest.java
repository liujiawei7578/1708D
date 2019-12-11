package com.bawei.util;

import java.util.Date;

import org.junit.Test;

public class DateTest {
	
	@Test
	public static void test1 (Date date) {
		 String month = DateUtils.getMonth(date);
		System.out.println(month);
	}
	
	//例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	@Test
	public static long test2 (Date date) {
		String year = DateUtils.getYear(date);
		System.out.println(year);
		return 0;
	}
	//例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年
	@Test
	public static void test3 (Date date) {
		  String time = DateUtils.getCurrTime();
		 
		System.out.println(time);
	}
	
	@Test
	public static void test4 (Date date) {
		 String date10to8 = DateUtils.getDate10to8("1999-05-06");
		System.out.println(date10to8);
	}
	//求过去日期离今天过去的天数
	@Test
	public static void test5 (String date,String time) {
		String time2 = DateUtils.getTime(date, time);
		System.out.println(time2);
	}
}
