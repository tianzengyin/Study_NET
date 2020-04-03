package com.itheima.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Java8TimeTemporalAdjusterDemo2 {
    public static void main(String[] args) {
        //封装日期时间对象为当前时间,LocalDate.
        LocalDate time = LocalDate.now();
        /*
        DayOfWeek是一周中星期几的枚举类,其中封装了从周一到周日.
         */
        //将当前时间修改为下一个周日
        LocalDate nextSunday = time.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        //将当前时间修改为上一个周三
        LocalDate previousWednesday = time.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
        System.out.println("下一个周日是:"+nextSunday);
        System.out.println("上一个周三是:"+previousWednesday);
    }
}
