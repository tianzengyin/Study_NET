package com.zengyin.exceptionPractice01;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 *
 *有一个圆形和长方形.
 *都可以获取面积  ,com.zengyin.exceptionPractice01对于面积如果出现非法的数值,视为是获取面积出现问题
 *
 *问题通过异常处理
 *
 *对这个程序进行基本设计.
 *
 *
 *
 * */
class NoValueException extends RuntimeException{
	NoValueException(String message){
		super(message);
	}
}
interface Shape{
	void getArea();
}
class Rec implements Shape{
	private int len , wid;
	Rec(int len , int wid)/*throws NoValueException*/{
		if(len<=0 || wid<=0){
			throw new NoValueException("出现非法值");
		}
		this.len = len;
		this.wid = wid;
	}
	public void getArea(){
		System.out.println(len*wid);
	}
}
public class DemoException03 {

	public static void main(String[] args) {
		
		Rec r = new Rec(-3 , 4);
		r.getArea();
		
	}

	

}
