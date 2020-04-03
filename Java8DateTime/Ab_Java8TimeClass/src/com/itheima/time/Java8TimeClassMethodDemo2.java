package com.itheima.time;

import java.time.*;

public class Java8TimeClassMethodDemo2 {
    public static void main(String[] args) {
        //初始化Year的实例化对象.
        Year year = Year.now();
        //初始化YearMonth的实例化对象
        YearMonth yearMonth = YearMonth.now();
        //初始化MonthDay的实例化对象.
        MonthDay monthDay = MonthDay.now();

        System.out.println("Year:" + year);
        System.out.println("YearMonth:" + yearMonth);
        System.out.println("monthDay:" + monthDay);
    }
}
