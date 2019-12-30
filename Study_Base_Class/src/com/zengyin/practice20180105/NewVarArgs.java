package com.zengyin.practice20180105;

public class NewVarArgs {
	
	public static void main(String[] args) {
		printArray(new Integer(4),new Float(3.14),new Double(11.11));
		printArray(47,3.14F,11.11);
		printArray("sadf","dsuidh");
		printArray((Object[])new Integer[]{1,2,3,4});
		printArray();
	}

	//可变参数
	static void printArray(Object... obj){
		for(Object o : obj){
			System.out.print(o+" ");
		}
		System.out.println();
	}
}
