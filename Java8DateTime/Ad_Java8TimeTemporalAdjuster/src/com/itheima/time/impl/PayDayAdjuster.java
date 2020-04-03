package com.itheima.time.impl;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

/**
 * 假如员工一个月中领取工资,发薪日是每个月的15号,如果发薪日是周末,则调整为周五.
 */
public class PayDayAdjuster implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        //1.将temporal转换为子类对象LocalDate,from方法可以将任何时态对象转换为LocalDate.
        LocalDate payDay = LocalDate.from(temporal);
        //2.判断当前封装的时间中的日期是不是当月15日,如果不是,则更改为15日.
        int day;
        if (payDay.getDayOfMonth() != 15) {
            day = 15;
        } else {
            day = payDay.getDayOfMonth();
        }
        LocalDate realPayDay = payDay.withDayOfMonth(day);
        //3.判断realPayDay对象中封装的星期数是不是周六或者是周日,如果是周末或者是周日则更改为周五.
        if (realPayDay.getDayOfWeek() == DayOfWeek.SUNDAY || realPayDay.getDayOfWeek() == DayOfWeek.SATURDAY) {
            //说明发薪日是周末,则更改为周五.
            realPayDay =  realPayDay.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        }
        return realPayDay;
    }
}
