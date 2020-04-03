package com.itheima.time;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Month枚举类的使用.
 */
public class Java8TimeClassMethodDemo6 {
    public static void main(String[] args) {
        //在初始化LocalDate和LocalDateTime的时候,月份的参数传入枚举类(2011年5月15日11时11分11秒)
        LocalDateTime.of(2011, Month.JUNE,15,11,11,11);

        //of方法可以根据传入的数字返回对应的月份.
        Month month = Month.of(12);
        System.out.println(month);

    }
}
