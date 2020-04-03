package com.itheima.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Java8TimeFormatAndParseDemo3 {
    public static void main(String[] args) {
        //对LocalDateTime进行格式化与解析,初始化LocalDateTime对象.
        LocalDateTime time = LocalDateTime.now();
        //通过通过DateTimeFormatter的ofPattern方法可以自定义格式化模式.
        String result = time.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss:SSS"));
        System.out.println("LocalDateTime格式化前是:" + time);
        System.out.println("LocalDateTime格式化后是:" + result);
    }
}
