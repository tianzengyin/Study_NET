package com.zengyin.practice20180105;



public class OrderOfinitialization {

	public static void main(String[] args) {
		House h = new House();
		h.f();
	}

}
class Window{
	Window(int marker){
		System.out.println("window("+marker+")");
	}
	
}
class House{
	Window w1  = new Window(1);
	House(){
		System.out.println("House()");
		w3 = new Window(33);
	}
	Window w2  = new Window(2);
	
	void f(){
		System.out.println("f()");
	}
	Window w3 = new Window(3);
}