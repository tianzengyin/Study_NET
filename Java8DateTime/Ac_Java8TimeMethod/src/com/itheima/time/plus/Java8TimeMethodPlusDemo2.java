package com.itheima.time.plus;

import java.time.LocalTime;

public class Java8TimeMethodPlusDemo2 {
    public static void main(String[] args) {
        //封装LocalTime对象参数为8时14分39秒218纳秒.
        LocalTime time = LocalTime.of(8, 14, 39, 218);

        //计算当前时间500纳秒后的时间.
        LocalTime plusNanosTime = time.plusNanos(500);
        //计算当前时间45秒后的时间.
        LocalTime plusSecondsTime = time.plusSeconds(45);
        //计算当前时间19分钟后的时间.
        LocalTime plusMinutesTime = time.plusMinutes(19);
        //计算当前时间3小时后的时间.
        LocalTime plusHoursTime = time.plusHours(3);

        System.out.println("当前的时间是:" + time);
        System.out.println("45秒后的时间是:" + plusSecondsTime);
        System.out.println("19分钟后的时间是:" + plusMinutesTime);
        System.out.println("500纳秒后的时间是:" + plusNanosTime);
        System.out.println("3小时后的时间是:" + plusHoursTime);
    }
}
