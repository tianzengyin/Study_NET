package com.zengyin.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 田增印
 * @Date: 2020/3/27
 * @Time: 11:31
 * @Description: com.zengyin.DateTest
 * @VERSION: 1.0
 */
public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        // new出SimpleDateFormat对象
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
        // 将时间对象转换成字符串
        String daytime = s1.format(new Date());
        System.out.println(daytime);
        System.out.println(s2.format(new Date()));
        System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
        // 将符合指定格式的字符串转成成时间对象.字符串格式需要和指定格式一致。
        String time = "2007-10-7";
        Date date = s2.parse(time);
        System.out.println("date1: " + date);
        String time2 = "2007-10-7 20:15:30";
        Date date1 = s1.parse(time2);
        System.out.println("date2: " + date1);
    }

}
