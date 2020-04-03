package com.itheima.time.convert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * 编写工具类传入不同的对象可以转换为对应的对象.
 */
public class Java8TimeConvertTool {
    /**
     * 将java.sql.Date转换为LocalDate
     *
     * @param date
     * @return
     */
    public static LocalDate convertFromSqlDateToLocalDate(java.sql.Date date) {
        return date.toLocalDate();
    }

    /**
     * 将LocalDate转换为java.sql.Date
     * @param date
     * @return
     */
    public static java.sql.Date convertFromLocalDateToSqlDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }

    /**
     * 将java.util.Date转换为LocalDate
     * @param date
     * @return
     */
    public static LocalDate convertFromUtilDateToLocalDate(java.util.Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * 将java.sql.Timestamp转换为LocalDateTime
     * @param timestamp
     * @return
     */
    public static LocalDateTime convertFromTimestampToLocalDateTime(java.sql.Timestamp timestamp) {
        return timestamp.toLocalDateTime();
    }

    /**
     * 将LocalDateTime转换为java.sql.Timestamp
     * @param localDateTime
     * @return
     */
    public static java.sql.Timestamp convertFromLocalDateTimeToTimestamp(LocalDateTime localDateTime) {
        return java.sql.Timestamp.valueOf(localDateTime);
    }

    /**
     * 将LocalDate转换为java.util.Date
     * @param date
     * @return
     */
    public static java.util.Date convertFromLocalDateToUtilDate(LocalDate date){
        ZonedDateTime zonedDateTime = date.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }
}
