package com.zengyin.practice20180108;

import java.io.PrintStream;

public class Print {
	public static void print(){
		System.out.println();
	}
	public static void print(Object obj){
		System.out.println(obj);
	}
	public static PrintStream printf(String format , Object... args ){
		return System.out.printf(format, args);
		
	}
	
}
