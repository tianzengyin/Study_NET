package com.itheima.time.impl;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

/**
 * 获取某一天距离下一个劳动节的相隔天数的实现类.
 */
public class UntilDayQueryImpl implements TemporalQuery<Long> {
    @Override
    public Long queryFrom(TemporalAccessor temporal) {
        //获取当前的年/月/日信息.
        int year = temporal.get(ChronoField.YEAR);
        int month = temporal.get(ChronoField.MONTH_OF_YEAR);
        int day = temporal.get(ChronoField.DAY_OF_MONTH);
        //将获取到的数据封装为一个LocalDate对象.
        LocalDate time = LocalDate.of(year, month, day);
        //封装劳动节的时间,年参数传递year,month和day是5和1.
        LocalDate laborDay = LocalDate.of(year, Month.MAY,1);
        //判断当前时间是否已经超过了当年的劳动节,如果超过了,则laborDay+1年.
        if (time.isAfter(laborDay)){
            laborDay = laborDay.plusYears(1);
        }
        //通过ChronoUnit的between方法计算两个时间点的差额.
        long l = ChronoUnit.DAYS.between(time, laborDay);
        return l;
    }
}
