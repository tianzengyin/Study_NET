package com.zengyin.practice20180105;

public class varArg {

	public static void main(String[] args) {
		f('n');
		f();
		g(5);
		g();
	}
	static void f(Character... args){
		System.out.println(args.getClass());
		System.out.println(args.length);
		
	}
	
	static void g(int... args){
		System.out.println(args.getClass());
		System.out.println(args.length);
		
	}
}
