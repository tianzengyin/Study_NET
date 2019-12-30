package com.zengyin.practice20180109;

public class Lunch {

	public static void main(String[] args) {
		Lunch lunch = new Lunch();
		lunch.testStatic();
		lunch.testSingleton();
	}

	void testStatic(){
		Soup1 soup1 = Soup1.makeSoup1();
		System.out.println(soup1.toString());
	}
	
	void testSingleton(){
		Soup2 soup2 = Soup2.makeSoup2();
		Soup2 soup3 = Soup2.makeSoup2();
		System.out.println(soup2 == soup3);
	}
}

class Soup1{
	private Soup1(){}
	
	public static Soup1 makeSoup1(){
		return new Soup1();
	}
	
}

class Soup2{
	private Soup2(){}
	private static Soup2 sp1 = new Soup2();
	public static Soup2 makeSoup2(){
		return sp1;
	}
}