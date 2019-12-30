package com.zengyin.demo_regex;

public class DemoSplit {

	public static void main(String[] args) {
		String s = "金三胖,郭美美 ,里一天";
		String[] arr = s.split(",");
		for(String i : arr){
			System.out.println(i);
		}
	}

}
