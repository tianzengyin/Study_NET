package com.zengyin.exceptionPractice01;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 *
 *��һ��Բ�κͳ�����.
 *�����Ի�ȡ���  ,com.zengyin.exceptionPractice01�������������ַǷ�����ֵ,��Ϊ�ǻ�ȡ�����������
 *
 *����ͨ���쳣����
 *
 *�����������л������.
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
			throw new NoValueException("���ַǷ�ֵ");
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
