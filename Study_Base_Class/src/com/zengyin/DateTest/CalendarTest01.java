package com.zengyin.DateTest;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {

	public static void main(String[] args) {
		//test01();
		Calendar c = Calendar.getInstance();
		//c.set(2020, 2, 14);
		c.add(Calendar.MARCH, 4);
		c.add(Calendar.YEAR, 2);
		c.add(Calendar.DAY_OF_WEEK, 3);
		printCalendar(c);
		
		
	}

	public static void printCalendar(Calendar c) {
		/*sop(c.get(Calendar.YEAR)+"年"+
		   (c.get(Calendar.MONTH)+1)+"月"+
		    c.get(Calendar.DAY_OF_MONTH)+"日");*/
		String[] mons = {"一月","二月","三月","四月","五月","六月",
				         "七月","八月","九月","十月","十一月","十二月"};
		int num = c.get(Calendar.MARCH);
		String[] weeks = {/*"",*/"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		sop(c.get(Calendar.YEAR)+"年");
		sop((mons[num]));
		int num2 = c.get(Calendar.DAY_OF_WEEK)-1;
		sop(weeks[num2]);
	}

	public static void test01() {
		//创建一个默认的Calendar对象
		Calendar c = Calendar.getInstance();
		//从Calendar对象中取出Date对象
		Date d = c.getTime();
		//通过Date对象获得对应的Calendar对象
		//因为Calendar/gregorianCalendar没有构造函数可以接收Date对象
		//所以必须先获得一个Calendar实例,然后调用其setTime()方法
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d);
	}
	public static void sop(Object obj){
		System.out.print(obj+" ");
	}
}
