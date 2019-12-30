package com.zengyin.demo_date;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
			/*Date d1 = new Date();
			Date d3 = new Date(System.currentTimeMillis()+2000);
			Date d2 = new Date(System.currentTimeMillis());
			System.out.println(d1);
			System.out.println(d3);
			System.out.println(d2);
			//System.out.println(d2 == d1);
			System.out.println(d2.compareTo(d3));
			System.out.println(d3.before(d2));*/
		Date d1 = new Date();
		//System.out.println(d1);
		/*Date d2 = new Date(10000);
		System.out.println(d2);*/
		System.out.println(d1.getTime());
		System.out.println(System.currentTimeMillis());
		
	}

}
