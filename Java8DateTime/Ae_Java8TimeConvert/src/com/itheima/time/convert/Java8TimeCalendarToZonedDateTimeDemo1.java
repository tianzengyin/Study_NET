package com.itheima.time.convert;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Java8TimeCalendarToZonedDateTimeDemo1 {
    public static void main(String[] args) {
        //初始化Canlendar对象.
        Calendar cal = Calendar.getInstance();
        //Calendar对象自Java1.1开始提供了一个方法获取时区对象的方法,getTimeZone,要将Calendar对象转换为ZonedDateTime需要先获取到时区对象.
        TimeZone timeZone = cal.getTimeZone();
        //从Java1.8开始TimeZone类提供了一个方法可以获取到ZonedId.
        ZoneId zoneId = timeZone.toZoneId();
        //获取到zoneId之后就可以初始化ZonedDateTime对象了,ZonedDateTime类有一个ofInstant方法,可以将一个Instant对象和ZonedId对象作为参数传入构造一个ZonedDateTime对象.
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(cal.toInstant(), zoneId);
        System.out.println("转换前的Calendar对象是:" + cal);
        System.out.println("转换后的ZonedDateTime对象是:" + zonedDateTime);
    }
}
