package com.itheima.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Java8TimeFormatAndParseDemo2 {
    public static void main(String[] args) {
        //对LocalDateTime进行格式化与解析,初始化LocalDateTime对象.
        LocalDateTime time = LocalDateTime.now();
        //通过DateTimeFormatter的ofLocalizedDate指定解析格式也可以格式化日期
        String r1 = time.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String r2 = time.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String r3 = time.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String r4 = time.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("FULL:"+r1);
        System.out.println("LONG:"+r2);
        System.out.println("MEDIUM:"+r3);
        System.out.println("SHORT:"+r4);
    }
}
