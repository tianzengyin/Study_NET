package com.zengyin.Package1;

class Root{
	static {
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root����ͨ��ʼ����");
	}
	public Root(){
		System.out.println("Root���޲ι�����");
	}
	
}
class Mid extends Root{
	static {
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}
	public Mid(){
		super();
		System.out.println("Mid���޲ι�����");
	}
	public Mid(String msg){
		this();
		System.out.println("Midd�Ĵ�����������,�����ֵ:"+msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}
	public Leaf(){
		super("java �����");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}
public class TestP161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Leaf();
		
		System.out.println("--------------------");
		new Leaf();
		System.out.println("--------------------");
		new Leaf();
	}

}
