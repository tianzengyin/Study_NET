package com.zengyin.ScannerDemo;

public class DemoString {

	public static void main(String[] args) {
		byte[] arr1 = {95,96,97,98,99};
		String s1 = new String(arr1);
		System.out.println(s1);
		byte[] arr2 = {97,98,99,100,101};
		String s2 = new String(arr2,2,3);
		System.out.println(s2);
		String s3 = "abc";
		String s4 = "Abc";
		boolean b1 = s3.equals(s4);
		System.out.println(b1);
		boolean b2 = s3.equalsIgnoreCase(s4);
		System.out.println(b2);
		
		char c1 = s4.charAt(1);
		System.out.println(c1);
		int i1 = s3.codePointAt(1);
		System.out.println(i1);
		String s5 = "a";
		String s6 = "A";
		int i2 = s6.compareTo(s5);
		System.out.println(i2);
		String s7 = "’≈∞Æ¡·";
		String s8 = s7.replace(s7, s4);
		System.out.println(s8);
		String s9 = "helloworld";
		System.out.println(s9.replaceAll("o", "&&&"));
		
	}
	

}
