package com.zengyin.demo_date;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar  calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date);
		System.out.println(date);
		System.out.println(calendar2.getTime());
	}

}
