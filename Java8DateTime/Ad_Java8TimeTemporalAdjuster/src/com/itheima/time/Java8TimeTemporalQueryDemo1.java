package com.itheima.time;

import com.itheima.time.impl.UntilDayQueryImpl;

import java.time.LocalDate;

public class Java8TimeTemporalQueryDemo1 {
    public static void main(String[] args) {
        //封装LocalDate对象为当前时间.
        LocalDate time = LocalDate.now();
        //调用time对象的query方法查询距离下一个五一劳动节还有多少天.
        Long l = time.query(new UntilDayQueryImpl());
        System.out.println("距离下一个五一劳动节还有:" + l + "天.");
    }
}
