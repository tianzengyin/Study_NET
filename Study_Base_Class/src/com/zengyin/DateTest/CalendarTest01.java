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
		/*sop(c.get(Calendar.YEAR)+"��"+
		   (c.get(Calendar.MONTH)+1)+"��"+
		    c.get(Calendar.DAY_OF_MONTH)+"��");*/
		String[] mons = {"һ��","����","����","����","����","����",
				         "����","����","����","ʮ��","ʮһ��","ʮ����"};
		int num = c.get(Calendar.MARCH);
		String[] weeks = {/*"",*/"������","����һ","���ڶ�","������","������","������","������"};
		sop(c.get(Calendar.YEAR)+"��");
		sop((mons[num]));
		int num2 = c.get(Calendar.DAY_OF_WEEK)-1;
		sop(weeks[num2]);
	}

	public static void test01() {
		//����һ��Ĭ�ϵ�Calendar����
		Calendar c = Calendar.getInstance();
		//��Calendar������ȡ��Date����
		Date d = c.getTime();
		//ͨ��Date�����ö�Ӧ��Calendar����
		//��ΪCalendar/gregorianCalendarû�й��캯�����Խ���Date����
		//���Ա����Ȼ��һ��Calendarʵ��,Ȼ�������setTime()����
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d);
	}
	public static void sop(Object obj){
		System.out.print(obj+" ");
	}
}
