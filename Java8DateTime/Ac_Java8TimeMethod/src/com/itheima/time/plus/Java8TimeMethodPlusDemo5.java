package com.itheima.time.plus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
结婚10年称为锡婚,2020年2月2日11点11分11秒称为对称日,很多情侣准备在那天结婚,如果在那天结婚了,那么锡婚会发生在什么时候.
 */
public class Java8TimeMethodPlusDemo5 {
    public static void main(String[] args) {
        LocalDateTime marryTime = LocalDateTime.of(2020, Month.FEBRUARY, 2, 11, 11, 11);
        //使用plus方法进行计算,添加1个,ChronoUnit.DECADES(十年).
        LocalDateTime time = marryTime.plus(1, ChronoUnit.DECADES);
        System.out.println("如果在" + marryTime + "结婚,那么锡婚是" + time);

        //如果锡婚后的半天准备要请所有亲戚朋友吃饭,那么吃饭的时间是.
        LocalDateTime eatTime = time.plus(1, ChronoUnit.HALF_DAYS);
        System.out.println("半天后吃饭,吃饭的时候是:" + eatTime);
    }
}
