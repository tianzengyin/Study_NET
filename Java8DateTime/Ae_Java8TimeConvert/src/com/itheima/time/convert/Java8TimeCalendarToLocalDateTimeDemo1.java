package com.itheima.time.convert;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class Java8TimeCalendarToLocalDateTimeDemo1 {
    public static void main(String[] args) {
        //初始化Canlendar对象.
        Calendar cal = Calendar.getInstance();
        //通过Getter方法获取到Calendar对象中封装的数据.
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        //将以上获取到的数据作为LocalDateTime的of方法的参数进行对象的封装.
        LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
        System.out.println("转换前的Calendar对象是:" + cal);
        System.out.println("转换后的LocalDateTime对象是:" + localDateTime);
    }
}
