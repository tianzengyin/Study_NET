package com.itheima.time.plus;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Java8TimeMethodPlusDemo1 {
    public static void main(String[] args) {
        //封装LocalDate对象参数为2016年2月13日.
        LocalDate date = LocalDate.of(2016, Month.FEBRUARY, 13);
        //计算当前时间的4天后的时间.
        LocalDate plusDaysTime = date.plusDays(4);
        //计算当前时间的周后的时间.
        LocalDate plusWeeksTime = date.plusWeeks(3);
        //计算当前时间的5个月后的时间.
        LocalDate plusMonthsTime = date.plusMonths(5);
        //计算当前时间的2年后的时间.
        LocalDate plusYearsTime = date.plusYears(2);
        System.out.println("当前的时间是:"+date);
        System.out.println("4天后的时间是:"+plusDaysTime);
        System.out.println("3周后的时间是:"+plusWeeksTime);
        System.out.println("5个月后的时间是:"+plusMonthsTime);
        System.out.println("2年后的时间是:"+plusYearsTime);
    }
}
