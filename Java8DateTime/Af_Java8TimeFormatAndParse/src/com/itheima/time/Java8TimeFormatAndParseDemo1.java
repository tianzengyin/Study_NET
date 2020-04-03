package com.itheima.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java8TimeFormatAndParseDemo1 {
    public static void main(String[] args) {
        //对LocalDateTime进行格式化与解析,初始化LocalDateTime对象.
        LocalDateTime time = LocalDateTime.now();

        //DateTimeFormatter类中定义了很多方式,通过常量名可以指定格式化方式.
        String result = time.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ISO_DATE_TIME格式化之后的String是:" + result);

        String result1 = time.format(DateTimeFormatter.ISO_DATE);
        System.out.println("ISO_DATE格式化之后的String是:" + result1);

        //解析字符串的方式通过LocalDateTime类的静态方法parse方法传入需要解析的字符串即可.
        LocalDateTime localDateTime = LocalDateTime.parse(result);
        System.out.println("解析了字符串之后的LocalDateTime是:" + localDateTime);

    }
}
