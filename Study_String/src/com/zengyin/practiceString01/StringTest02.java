package com.zengyin.practiceString01;

public class StringTest02 {
	/**
	 * 练习一:去除字符串两端空格
	 * 实现trim方法
	 * */
	public static String myTrim(String str){
		/*int pos = 0;
		while(str.charAt(pos) == ' ')
	    pos++; 
		int x = str.length()-1;
		while(str.charAt(x)== ' ')
		x--;
		return str.substring(pos, x);*/
		//优化代码:
		int start = 0 , end = str.length()-1;
		while(start <= end && str.charAt(start) == ' ')
			start++;
		while(start <= end && str.charAt(end) == ' ')
			end--;
		return str.substring(start, end+1);
	}
	
	public static void main(String[] args){
		String a = "   afsd sd  "; 
		sop(myTrim(a));
	}
	public static void sop(String str){
		System.out.println(str);
	}
}
