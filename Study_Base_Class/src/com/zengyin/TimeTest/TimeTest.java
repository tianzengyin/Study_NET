package com.zengyin.TimeTest;

import java.time.Clock;
import java.time.Duration;

public class TimeTest {

	public static void main(String[] args) {
		//��ȡ��ǰClock
		Clock clock = Clock.systemUTC();
		//ͨ��Clock��ȡ��ǰʱ��
		sop("��ǰʱ��Ϊ:"+clock.instant());
		//��ȡclock��Ӧ�ĺ�����,��System.currentTimeMillis()�����ͬ
		sop(clock.millis());
		sop(System.currentTimeMillis());
		sop("------------------");

		Duration d = Duration.ofSeconds(6000);
		sop("6000���൱��" + d.toMinutes()+"��");
		sop("6000���൱��" + d.toHours() +"Сʱ");
		sop("6000���൱��" + d.toDays() + "��");
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
