package com.zengyin.demo_regex;

public class DemoSplit {

	public static void main(String[] args) {
		String s = "������,������ ,��һ��";
		String[] arr = s.split(",");
		for(String i : arr){
			System.out.println(i);
		}
	}

}
