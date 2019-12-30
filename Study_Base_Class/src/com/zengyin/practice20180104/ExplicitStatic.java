package com.zengyin.practice20180104;
/**
 * 
 *   练习显示的静态初始化
 *
 * */
public class ExplicitStatic {
	public static void main(String[] args){
		System.out.println("执行程序启动入口");
		Cups.cup1.f(99);
	}
}
/**
 * @author lenovo
 *
 */
class Cup{
    
	 int i ;
	 
	/*public Cup(int i) {
		super();
		this.i = i;
	}*/

	public Cup(int marker) {
		super();
		System.out.println("调用杯子的构造器("+marker+")");
		
	}
	void f(int marker){
		System.out.println("调用杯子的构造器("+marker+")");
	}
	
}

class Cups {
	
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		System.out.println("执行Cups构造器");
	}
	
}