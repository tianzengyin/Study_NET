package com.zengyin.exceptionPractice01;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * 
 * 异常在子父类覆盖中的体现:
 * 1.子类在覆盖父类时,如果父类的方法抛出异常,那么子类中的覆盖方法,
 *   只能抛出父类的异常或者该异常的子类.
 * 2.如果父类方法抛出多个异常,那么子类在覆盖方法时,只能抛出父类异常的子集.
 * 3.如果父类或者接口的方法中没有异常抛出,那么子类在父类方法时,也不可以抛出异常.
 *   如果子类方法发生了异常,就必须要进行try处理.绝对不能抛出.
 * 
 * 
 * */

/***
 *   Exception
 *      |--AException
 *           |--BException
 *      |--CException      
 * 
 * 
 */
 class AException extends Exception{
	 
 }
 class BException extends AException{
	 
 }
 class CException extends Exception{
	 
 }
class Fu{
	void show()throws AException{
		
	}
}

class Test{
	void function(Fu f){
		try {
			f.show();
		} catch (AException e) {
			
			e.printStackTrace();
		}
	}
}
class Zi extends Fu{
	void show()throws BException{
		
	}
}
public class DemoException02 {

	public static void main(String[] args) {
		Test t = new Test();
		t.function(new Fu());

	}

}
