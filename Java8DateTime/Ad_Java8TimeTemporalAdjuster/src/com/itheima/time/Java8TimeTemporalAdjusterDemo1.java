package com.itheima.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Java8TimeTemporalAdjusterDemo1 {
    public static void main(String[] args) {
        //封装日期时间对象为当前时间,LocalDate.
        LocalDate time = LocalDate.now();
        /*
        with方法可以修改time对象中封装的数据,需要传入一个TemporalAdjuster对象,
        通过查看发现TemporalAdjuster是一个接口,方法的参数是一个接口,那么实际上传入的是这个接口的实现类对象.
        TemporalAdjusters的类可以给我们提供一些常用的方法.
         */

        //with方法传入了TemporalAdjuster类的实现对象,是由TemporalAdjusters类的方法实现了adjustInto方法,当前的逻辑是:将时间修改为当月的第一天.
        LocalDate firstDayOfMonth = time.with(TemporalAdjusters.firstDayOfMonth());
        //将时间修改为下个月的第一天.
        LocalDate firstDayOfNextMonth = time.with(TemporalAdjusters.firstDayOfNextMonth());
        //将时间修改为下一年的第一天.
        LocalDate firstDayOfNextYear = time.with(TemporalAdjusters.firstDayOfNextYear());
        //将时间修改为本年的第一天.
        LocalDate firstDayOfYear = time.with(TemporalAdjusters.firstDayOfYear());
        //将时间修改为本月的最后一天.
        LocalDate lastDayOfMonth = time.with(TemporalAdjusters.lastDayOfMonth());
        //将时间修改为本年的最后一天.
        LocalDate lastDayOfYear = time.with(TemporalAdjusters.lastDayOfYear());

        System.out.println("当月的第一天是:" + firstDayOfMonth);
        System.out.println("下个月的第一天是:" + firstDayOfNextMonth);
        System.out.println("下一年的第一天是:" + firstDayOfNextYear);
        System.out.println("本年的第一天是:" + firstDayOfYear);
        System.out.println("本月的最后一天是:" + lastDayOfMonth);
        System.out.println("本年的最后一天是:" + lastDayOfYear);
    }
}
