package com.zengyin.practiceString01;
/**
 * 
 * ��ϰ2 :��һ���ַ������з�ת
 * 1���ַ����������
 * 2��������з�ת
 * 3���������ַ���
 * 
 * */
public class StringTest03 {
	public static String reverseString(String str, int x ,int y){
		char[] sArr = str.toCharArray();
		reversr(sArr,x,y);
		return new String(sArr);
	}
    public static String reverseString(String str){
    	
    	return reverseString(str,0,str.length());
    	
    }
    public static void reversr(char[] ch,int x, int y){
    	for(int start = x,end = y-1/*ch.length-1*/;start<end;start++,end--){
            swap(ch,start,end);    		
    	}
    }
    public static void swap(char[] ch, int x, int y){
    	char tem = ch[x];
    	ch[x] = ch[y];
    	ch[y] = tem;
    }
	public static void main(String[] args) {
		/*String[] a = {"a","b","c","d","e","f"};
		String[] b = reverseArray2(a);
		for(int i = 0;i<b.length;i++){
			sop(b[i]);
		}*/
		String s = "asdfdasasfd";
		sop(reverseString(s));
		
	}
	public static void sop(String str){
		System.out.println(str);
	}
    /**
     * ���鷴ת1
     * 
     * */
	public static String[] reverseArray(String[] Array){
		String[] newArray = new String[Array.length];
		for(int i = 0 ;i<Array.length;i++){
			newArray[i] = Array[Array.length-i-1];
		}
		return newArray;
	}
	
	/**
	 * ���鷴ת2
	 * */
	public static String[] reverseArray2(String[] Array){
		String[] newArray = new String[Array.length];
		for(int i = 0;i<Array.length/2  ;i++){
			String s1 = Array[i];
			String s2 = Array[Array.length-i-1];
			Array[i] = s2; 
			Array[Array.length-i-1] = s1;
			newArray = Array;
		}
		return newArray;
	}
}
