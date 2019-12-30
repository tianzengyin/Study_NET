package com.zengyin.Package1;

class Root{
	static {
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}
	public Root(){
		System.out.println("Root的无参构造器");
	}
	
}
class Mid extends Root{
	static {
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	public Mid(){
		super();
		System.out.println("Mid的无参构造器");
	}
	public Mid(String msg){
		this();
		System.out.println("Midd的带参数构造器,其参数值:"+msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}
	public Leaf(){
		super("java 疯狂讲义");
		System.out.println("执行Leaf的构造器");
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
