package com.zengyin.practiceString01;
/**
 * 
 * ��ȡһ���ַ�������һ�ַ������ֵĴ���
 * 
 * */
public class StringTest04 {
	//��ʽһ
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
	//��ʽ��
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
