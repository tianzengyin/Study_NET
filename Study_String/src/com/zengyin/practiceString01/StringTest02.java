package com.zengyin.practiceString01;

public class StringTest02 {
	/**
	 * ��ϰһ:ȥ���ַ������˿ո�
	 * ʵ��trim����
	 * */
	public static String myTrim(String str){
		/*int pos = 0;
		while(str.charAt(pos) == ' ')
	    pos++; 
		int x = str.length()-1;
		while(str.charAt(x)== ' ')
		x--;
		return str.substring(pos, x);*/
		//�Ż�����:
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
