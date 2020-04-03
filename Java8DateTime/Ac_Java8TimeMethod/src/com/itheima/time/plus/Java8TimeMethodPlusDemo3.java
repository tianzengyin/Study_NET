package com.itheima.time.plus;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Java8TimeMethodPlusDemo3 {
    public static void main(String[] args) {
        //在初始化LocalDate和LocalDateTime的时候,月份的参数传入枚举类(2011年5月15日11时11分11秒)
        LocalDateTime time = LocalDateTime.of(2011, Month.JUNE, 15, 11, 11, 11);


    }
}
