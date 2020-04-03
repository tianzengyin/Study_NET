package com.itheima.time.plus;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
今天程序员小郝在查看自己的车辆保险记录的时候查看到还有2年3个月零8天保险就到期了,计算2年3个月零8天后的时间是多少.
 */
public class Java8TimeMethodPlusDemo4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); //date表示当前时间.
        //固然可以使用对于年月日依次+2,+3,+8的方式来操作,但是有些繁琐,首先我们先将2年3月8天封装为一段时间,也就是封装为一个Period对象.
        Period time = Period.of(2, 3, 8);
        //使用plus方法对于date对象直接进行增加的操作.
        LocalDate endDate = date.plus(time);
        System.out.println("今天是" + date + ",保险到期的时间是" + endDate + ".");

        LocalDate plus = date.plus(1, ChronoUnit.CENTURIES);
        System.out.println(plus);
    }
}
