package com.itheima.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8TimeClassMethodDemo3 {
    public static void main(String[] args) {
        //初始化2018年8月8日的LocalDate对象.
        LocalDate date = LocalDate.of(2018, 8, 8);
        System.out.println("LocalDate:" + date);

        /*
         初始化晚上7点0分0秒的LocalTime对象.
         LocalTime.of方法的重载形式有以下几种,可以根据实际情况自行使用.
         LocalTime of(int hour, int minute) -> 根据小时/分钟生成对象.
         LocalTime of(int hour, int minute, int second) -> 根据小时/分钟/秒生成对象.
         LocalTime of(int hour, int minute, int second, int nanoOfSecond) -> 根据小时/分钟/毫秒/纳秒生成对象.

         注意:如果秒和纳秒为0的话,那么默认不会封装这些数据,只显示小时和分钟.
         */

        LocalTime time = LocalTime.of(19, 0, 0, 0);
        System.out.println("LocalTime:" + time);

        /*
        初始化2018年8月8日下午7点0分的LocalDateTime对象.
        LocalDateTime.of方法的重载形式有以下几种,可以根据事情自行使用.
        LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond) -> 根据年/月/日/时/分/秒生成对象.
        LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute) -> 根据年/月/日/时/分生成对象.
        注意:LocalDateTime of(LocalDate date, LocalTime time)方法可以将一个LocalDate对象和一个LocalTime对象合并封装为一个LocalDateTime对象.
         */
        LocalDateTime.of(2018, 8, 8, 19, 0, 0, 0);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println("LocalDateTime:" + localDateTime);
    }
}
