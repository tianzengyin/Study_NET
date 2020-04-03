package com.itheima.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

/**
 * 创建2012年12年31日7时38分46秒的日期对象打印到控制台输出.
 * 创建2012年12年31日的日期对象打印到控制台输出.
 * 创建7时38分46秒的时间对象打印到控制台输出.
 * 分析:首先LocalDate是日期(年月日) LocalTime是时间(时分秒) 题目要求打印年月日时分秒,可以使用LocalDateTime用于表示,使用of方法将对应的参数传入即可.
 */
public class Java8TimeTest1 {
    public static void main(String[] args) {
        //初始化LocalDateTime对象,并且传入对应参数2012年12年31日7时38分46秒.
        LocalDateTime date = LocalDateTime.of(2012, Month.SEPTEMBER, 30, 7, 38, 46);
        System.out.println(date);

        //初始化LocalTime对象,并且传入对应参数7时38分46秒.
        LocalTime time = LocalTime.of(7, 38, 46);
        System.out.println(time);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
    }
}
