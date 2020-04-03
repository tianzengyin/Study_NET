package com.itheima.time.convert;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Java8TimeDateToLocalDateDemo4 {
    public static void main(String[] args) {
        //初始化Date对象.
        Date d = new Date();
        /*
        java.sql.Date类提供了转换为LocalDate的方法,那么可以将java.util.Date先转换为java.sql.Date.
        通过java.sql.Date的构造方法直接传入一个毫秒值可以构造一个java.sql.Date对象,毫秒值可以通过java.util.Date对象的getTime方法获取到.
         */
        java.sql.Date date = new java.sql.Date(d.getTime());
        //将java.sql.Date转化为LocalDate.
        LocalDate localDate = date.toLocalDate();
        System.out.println("转换前的java.util.Date类对象是:" + d);
        System.out.println("转换后的LocalDate类对象是:" + localDate);
    }
}
