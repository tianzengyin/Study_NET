package com.zengyin.InterfaceDemo;

public class Teacher implements Singer , Pinter{
	private String name;
	public Teacher(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void teach(){
		System.out.println("���ڽ�ѧ");
	}
	
	public void sing(){
		System.out.println("��ʦ����");
	}
	public void sleep(){
		System.out.println("��ʦ˯��");
	}
	public void paint(){
		System.out.println("��ʦ����");
	}
	public void eat(){
		System.out.println("��ʦ�Է�");
	}
	public static void main(String[] args){
		Singer s1 = new Student("le");
		s1.sing();
		s1.sleep();
		//s1.study();
		Singer t1 = new Teacher("����");
		t1.sing();
		t1.sleep();
		Pinter p1 = (Pinter)t1;
		p1.paint();
		p1.eat();
		
	}
}
