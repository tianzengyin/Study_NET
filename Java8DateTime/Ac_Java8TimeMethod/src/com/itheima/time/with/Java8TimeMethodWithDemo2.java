package com.itheima.time.with;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Java8TimeMethodWithDemo2 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        //经过使用发现time中的时间有错误,应该是1日,在不知道原有时间的基础上,无法进行增减操作,所以可以直接使用with方法进行修改.
        LocalDateTime endTime = time.with(ChronoField.DAY_OF_MONTH,1);
        System.out.println("修改前错误的时间是:" + time);
        System.out.println("修改完成之后的时间是:" + endTime);
    }
}
