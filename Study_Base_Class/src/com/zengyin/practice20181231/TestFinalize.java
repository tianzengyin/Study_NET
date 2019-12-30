package com.zengyin.practice20181231;

public class TestFinalize {

	public static void main(String[] args) {
		TestFinalize tobj = new TestFinalize();
		tobj.Test();
		System.gc();
	}
	public void Test(){
		A aobj = new A("tom");
		
	}
}
class A {
	
	String name = "";
	public A(String name){
		this.name = name;
	}
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println(name+"对象被销毁了");
	}
}