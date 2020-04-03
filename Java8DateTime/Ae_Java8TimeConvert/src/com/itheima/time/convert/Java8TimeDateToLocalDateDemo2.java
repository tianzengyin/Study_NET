package com.itheima.time.convert;

import java.time.*;
import java.sql.Date;

public class Java8TimeDateToLocalDateDemo2 {
    public static void main(String[] args) {
        //初始化java.sql.Date对象.
        Date d = new Date(System.currentTimeMillis());
        //将java.sql.Date对象通过toLocalDate方法转换为LocalDate对象.
        LocalDate localDate = d.toLocalDate();
        System.out.println("转换前的java.sql.Date对象是:" + d);
        System.out.println("转换后的LocalDate对象是:" + localDate);
    }
}
