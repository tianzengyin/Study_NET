package com.zengyin.practice20180104;
/**
 * 
 *   ��ϰ��ʾ�ľ�̬��ʼ��
 *
 * */
public class ExplicitStatic {
	public static void main(String[] args){
		System.out.println("ִ�г����������");
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
		System.out.println("���ñ��ӵĹ�����("+marker+")");
		
	}
	void f(int marker){
		System.out.println("���ñ��ӵĹ�����("+marker+")");
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
		System.out.println("ִ��Cups������");
	}
	
}