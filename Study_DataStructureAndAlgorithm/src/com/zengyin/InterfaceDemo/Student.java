package com.zengyin.InterfaceDemo;

public class Student implements Singer {
	private String name;
	public Student(){}
	public Student(String name){
		this.name = name;
	}
	public void study(){
		System.out.println("����ѧϰ");
	}
	public String getName(){
		return this.name;
	} 
	public void sing(){
		System.out.println("���ڳ���");
	}
	public void sleep(){
		System.out.println("����˯��");
	}
}
