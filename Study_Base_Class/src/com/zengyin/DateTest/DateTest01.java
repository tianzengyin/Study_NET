package com.zengyin.DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		//��ģʽ��װ��SimpleDateFormat������
		//����format������ģʽ��ʽ��ָ��Data����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println(sdf.format(d));
	}

}
