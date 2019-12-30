package com.zengyin.practice20180105;

public class OptionalTrailingArguments {

	public static void main(String[] args) {
		f(1,"one");
		f(2,"two","three");
		f(0);
	}
	static void f(int required , String... trailing){
		System.out.println("required  "+ required);
		for(String str : trailing){
			System.out.println(str + " ");
		}
		System.out.println();
	}
}
