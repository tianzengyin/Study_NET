package com.zengyin.practice201901;

import java.util.ArrayList;
import java.util.List;

public class Apple<T> {

	private T info;
	public Apple(){}
	
	public Apple(T info){
		this.info = info;
	}
	public void setInfo(T info){
		this.info = info;
	}
	public T getInfo(){
		return this.info;
		
	}
	public static void main(String[] args){
		
		Apple<String> a1 = new Apple<>("Æ»¹û");
		System.out.println(a1.getInfo());
		Apple<Double> a2 = new Apple<>(5.62);
		System.out.println(a2.getInfo());
		List<String> aa = new ArrayList<>();
		List<Integer> bb = new ArrayList<>();
		String aaClass = aa.getClass().toString();
		String bbClass = aa.getClass().toString();
		System.out.println(aaClass);
		System.out.println(bbClass);
	}
}
class A extends Apple<String>{
	public String getInfo(String info){
		return "×ÓÀà" + super.getInfo();
	}
}
class B extends Apple{}
