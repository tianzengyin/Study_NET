package com.itheima.time;

import java.time.ZoneId;
import java.util.Set;

public class Java8TimeClassMethodDemo4 {
    public static void main(String[] args) {
        //获取所有的时区信息
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : availableZoneIds) {
            System.out.println(zoneId);
        }

        //获取当前系统默认的时区信息
        /*ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);*/
    }
}
