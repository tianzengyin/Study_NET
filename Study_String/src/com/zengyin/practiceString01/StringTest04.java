package com.zengyin.practiceString01;
/**
 * 
 * 获取一个字符串在另一字符串出现的次数
 * 
 * */
public class StringTest04 {
	//方式一
	public static int getsubcount(String str,String key){
		int count = 0;
		int index = 0;
		while((index = (str.indexOf(key))) != -1){
			sop(str);
			str= str.substring(index+key.length());
			//sop(str);
			count++;
		}
		return count;
		
	}
	//方式二
	public static int getsubcount2(String str,String key){
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key, index+key.length())) != -1){
			sop("index = " + index);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String s1 = "adssrdssgsfdssklss";
		String s2 = "ss";
		sop(String.valueOf(getsubcount2(s1,s2)));
	}
	public static void sop(String str){
		System.out.println(str);
	}
}
