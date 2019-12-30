package com.zengyin.practice20180105;

public class VarArgs {

	public static void main(String[] args) {
		printArray(new Object[]{new Integer(4),new Float(3.14),new Double(11.11)});
	}

	static void printArray(Object[] obj){
		for(Object o : obj){
			System.out.print(o+" ");
		}
		System.out.println();
	}
}
