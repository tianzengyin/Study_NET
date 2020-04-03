package com.itheima.time.convert;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Java8TimeTimestampToLocalDateDemo1 {
    public static void main(String[] args) {
        //初始化java.sql.Timestamp对象.
        Timestamp t = new Timestamp(System.currentTimeMillis());
        //将java.sql.Timestamp对象通过toLocalDateTime方法转换为LocalDateTime对象.
        LocalDateTime localDateTime = t.toLocalDateTime();
        System.out.println("转换之前的Timestamp对象是:" + t);
        System.out.println("转换之后的LocalDateTime对象是:" + localDateTime);
    }
}
