package com.itheima.time.convert;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Java8TimeDateToLocalDateDemo1 {
    public static void main(String[] args) {
        //初始化Date对象.
        Date d = new Date();
        //将Date类对象转换为Instant类对象.
        Instant i = d.toInstant();
        //Date类包含日期和时间信息,但是并不提供时区信息,和Instant类一样,可以通过Instant类的atZone方法添加时区信息之后进行转换.
        ZonedDateTime zonedDateTime = i.atZone(ZoneId.systemDefault());
        //将ZonedDateTime通过toLocalDate方法转换为LocalDate对象.
        LocalDate localDate = zonedDateTime.toLocalDate();
        System.out.println("转换之前的Date对象是:" + d);
        System.out.println("转换之后的LocalDate对象是:" + localDate);
    }
}
