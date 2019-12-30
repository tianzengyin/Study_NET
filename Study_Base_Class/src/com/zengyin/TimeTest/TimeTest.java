package com.zengyin.TimeTest;

import java.time.Clock;
import java.time.Duration;

public class TimeTest {

	public static void main(String[] args) {
		//获取当前Clock
		Clock clock = Clock.systemUTC();
		//通过Clock获取当前时刻
		sop("当前时刻为:"+clock.instant());
		//获取clock对应的毫秒数,与System.currentTimeMillis()输出相同
		sop(clock.millis());
		sop(System.currentTimeMillis());
		sop("------------------");

		Duration d = Duration.ofSeconds(6000);
		sop("6000秒相当于" + d.toMinutes()+"分");
		sop("6000秒相当于" + d.toHours() +"小时");
		sop("6000秒相当于" + d.toDays() + "天");
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
