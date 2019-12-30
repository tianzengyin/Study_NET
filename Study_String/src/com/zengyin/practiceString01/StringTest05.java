package com.zengyin.practiceString01;

public class StringTest05 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append(34);
		sop("sb == sb1:"+(sb == sb1));
		sop(sb.toString());
		sop(sb1.toString());
		
	}
	public static void sop(String strBuff){
		System.out.println(strBuff);
	}
}
