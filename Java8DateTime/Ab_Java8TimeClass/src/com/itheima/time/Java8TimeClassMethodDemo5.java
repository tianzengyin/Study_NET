package com.itheima.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 为LocalDateTime添加时区信息.
 */
public class Java8TimeClassMethodDemo5 {
    public static void main(String[] args) {
        //1.封装LocalDateTime对象,参数自定义 -> 2018年11月11日 8点54分38秒
        LocalDateTime time = LocalDateTime.of(2018, 11, 11, 8, 54, 38);
        //2.封装完成后的time对象只是封装的是一个时间,并没有时区相关的数据,所以添加时区到对象中,使用atZone方法.
        ZonedDateTime zonedDateTime = time.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println("Asia/Shanghai的时间是:" + zonedDateTime);
        //3.更改时区查看其它时区的当前时间,通过withZoneSameInstant方法即可更改.
        ZonedDateTime otherZonedTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("在同一时刻,Asia/Tokyo的时间是:" + otherZonedTime);
    }
}
