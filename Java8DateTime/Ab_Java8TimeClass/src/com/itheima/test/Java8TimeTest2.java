package com.itheima.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

/**
 * 通过键盘录入的方式创建2014年11月11日 11时11分11秒的日期对象打印到控制台输出.
 *
 * 要求键盘录入:字符缓冲流输入流录入对应的数据,然后将数据封装到LocalDateTime的of方法的参数中返回对应的对象.
 */
public class Java8TimeTest2 {
    public static void main(String[] args) throws IOException {
        //初始化字符缓冲输入流,用于读取键盘录入的数据.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //给出提示并且获取到输入的数据.
        System.out.println("请输入年份数据:");
        String year = br.readLine();
        System.out.println("请输入月份数据:");
        String month = br.readLine();
        System.out.println("请输入日期数据:");
        String day = br.readLine();
        System.out.println("请输入小时数据:");
        String hour = br.readLine();
        System.out.println("请输入分钟数据:");
        String minute = br.readLine();
        System.out.println("请输入秒数据:");
        String second = br.readLine();
        //将以上获取到的数据作为参数封装日期对象.
        LocalDateTime time = LocalDateTime.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day), Integer.parseInt(hour), Integer.parseInt(minute), Integer.parseInt(second));
        System.out.println("您输入的时间是:"+time);
    }
}
