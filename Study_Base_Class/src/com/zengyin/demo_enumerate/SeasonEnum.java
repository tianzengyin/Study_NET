package com.zengyin.demo_enumerate;

public enum SeasonEnum {
	SPRING,SUMMER, FALL,WINTER;
	//int a = SUMMER.compareTo(FALL);
	public boolean SeasonEnumFor(SeasonEnum s){
		if(compareTo(s) <= 0){
			return true;
		}
		return false;
	}
}
