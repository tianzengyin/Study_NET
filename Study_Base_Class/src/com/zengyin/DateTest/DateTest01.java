package com.zengyin.DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		//将模式封装到SimpleDateFormat对象中
		//调用format方法让模式格式化指定Data对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf.format(d));
	}

}
