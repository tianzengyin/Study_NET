package com.zengyin.practice20180109;

public class Bath {
	private String s1= "Happy", s2 = "Happy", s3 , s4;
	private Soap castille;
	private int i;
	private float toy;
	public Bath(){
		System.out.println("Inside Bath()");
		//��������ʼ��
		s3 = "joy";
		toy = 3.14f;
		castille = new Soap();
	}
	//ʵ����ʼ��
	{
		i= 47;
	}
	public String toString(){
		if(s4==null) {
			s4 = "joy";//�ӳٳ�ʼ������Գ�ʼ��
		} 
		return  "Bath:[s1 =" +s1 + "\n" +
		        "s2 +" +s2 + "\n" +
		        "s3 +" +s3 + "\n" +
		        "s4 +" +s4 + "\n" +
		        "castille +" + castille + "\n" +
		        "i +" + i + "\n" +
		        "toy +" + toy + "\n]" ;        
	}
	 public static void main(String[] args){
		 Bath bath = new Bath();
		 System.out.println(bath);
	 }
}

class Soap{
	private String s;
	Soap(){
		System.out.println("Soap()");
		s = "Constructed";
	}
	public String toString(){
		return s;
	}
}