package com.zengyin.DateTest;
/**
 * 
 * 两个练习:
 * 
 *  1. 获取任意年的二月有多少天
 *  	思路:根据指定年设置一个时间就是 
 *          c.set(year,2,1)//某一年的3月1日
 *          c.add(Calebdar.DAY_OF_MONTH,-1);//3月1日,往前推一天,就是2月最后一天.
 *  
 *  2. 获取昨天的现在时刻
 *          c.add(Calebdar.DAY_OF_MONTH,-1);
 *          
 * */
public class CalendarTest02 {

	public static void main(String[] args) {

	}

}
