package com.zengyin.Package1;

public class FinalVariableTest {

	final int a = 6;
	final String str;
	final int c ;
	final static double d;
	//final char ch;
	/**
	 *   ³õÊ¼»¯¿é
	 * */
	{
		str = "hello";
		
	}
	static {
		d = 5.6;
	}
	public FinalVariableTest(){
		c = 5;
	}
	public void changrFinal(){
		
	}
	public static void main(String[] args) {
		FinalVariableTest ft  = new FinalVariableTest();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
		new FinalErrorTest();
	}

}
class FinalErrorTest{
	final int age;
	{
		printAge();
		age = 6;
		System.out.println(age);
	}
	public void printAge(){
		System.out.println(age);
	}
	
}
class FinalLocalVariableTest{
	public void test(final int a){
		final String str = "hello";
		final double d;
		d=2.3;
		//d = 32;
	}
	
}

