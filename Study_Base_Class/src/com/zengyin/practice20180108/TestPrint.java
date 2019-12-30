package com.zengyin.practice20180108;
//import c
public class TestPrint {

	public static void main(String[] args) {
		Print pr = new Print();
		pr.print("hello");
		pr.printf("sdfsfsf");
		
		int[] arrayint = Range.reange(10,20);
		for(int i =0 ;i<arrayint.length;i++){
			Print.print("arrayint["+i+"]:"+arrayint[i]);
		}
		
	}

}
