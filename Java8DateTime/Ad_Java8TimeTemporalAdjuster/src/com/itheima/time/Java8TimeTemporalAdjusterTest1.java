package com.itheima.time;

import com.itheima.time.impl.PayDayAdjuster;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Java8TimeTemporalAdjusterTest1 {
    public static void main(String[] args) {
        //封装LocalDate对象为2018年12月1日.
        LocalDate payDay = LocalDate.of(2019, 12, 1);
        //2018年12月15日为周末,所以要提前到周五发放工资,通过自定义调节器完成对时间的修改.
        LocalDate realPayDay = LocalDate.from(new PayDayAdjuster().adjustInto(payDay));
        System.out.println("预计的发薪日是2018年12月15日,实际的发薪日为:" + realPayDay);
    }
}
