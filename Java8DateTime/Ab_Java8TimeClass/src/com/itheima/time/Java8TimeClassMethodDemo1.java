package com.itheima.time;

import java.time.*;

/**
 * Date-Time API中的所有类均生成不可变实例,它们是线程安全的,并且这些类不提供公共构造函数,也就是说没办法通过new的方式直接创建,需要采用工厂方法加以实例化.
 *
 * now方法可以根据当前日期或时间创建实例.
 */
public class Java8TimeClassMethodDemo1 {
    public static void main(String[] args) {
        //使用now方法创建Instant的实例对象.
        Instant instantNow = Instant.now();
        //使用now方法创建LocalDate的实例对象.
        LocalDate localDateNow = LocalDate.now();
        //使用now方法创建LocalTime的实例对象.
        LocalTime localTimeNow = LocalTime.now();
        //使用now方法创建LocalDateTime的实例对象.
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        //使用now方法创建ZonedDateTime的实例对象.
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();

        //将实例对象打印到控制台.
        System.out.println("Instant:"+instantNow);
        System.out.println("LocalDate:"+localDateNow);
        System.out.println("LocalTime:"+localTimeNow);
        System.out.println("LocalDateTime:"+localDateTimeNow);
        System.out.println("ZonedDateTime:"+zonedDateTimeNow);
    }
}
