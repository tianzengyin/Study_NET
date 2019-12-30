package com.zengyin.ScannerDemo;

public class DemoStringBuffer {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		s1.append(true);
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer("�й�");
		char[] c1 = {'a' , 'b' , 'c'};
		s1.append(c1);
		//s2.append(c1);
		System.out.println(s1);
		System.out.println(s2);
		s2.append("�Ұ��������ƺ�",0,3);
		System.out.println(s2);
		int i = s2.capacity();
		System.out.println(i);
		System.out.println();
		StringBuffer s3 =new StringBuffer( "abcdefg");
		boolean b  = true;
		System.out.println("-----------");
		StringBuffer s4 = s3.insert(2, false);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4);
		System.out.println("------------");
		System.out.println(s4.equals(s3));
		StringBuffer s5 = s3.insert(2, b);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("------------");
		System.out.println(s5.equals(s4));
		StringBuffer s6=s4.append(s5);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s5.equals(s4));
		System.out.println("------------");
		int i1 = s6.length();
		System.out.println(i1);
		System.out.println(s6.reverse());
	//	s2.setCharAt(1, '��');
		System.out.println(s2);
		s2.setLength(12);
		System.out.println(s2.length());
		
	}

}
