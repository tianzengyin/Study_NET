package com.zengyin.exceptionPractice01;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * 
 * �쳣���Ӹ��า���е�����:
 * 1.�����ڸ��Ǹ���ʱ,�������ķ����׳��쳣,��ô�����еĸ��Ƿ���,
 *   ֻ���׳�������쳣���߸��쳣������.
 * 2.������෽���׳�����쳣,��ô�����ڸ��Ƿ���ʱ,ֻ���׳������쳣���Ӽ�.
 * 3.���������߽ӿڵķ�����û���쳣�׳�,��ô�����ڸ��෽��ʱ,Ҳ�������׳��쳣.
 *   ������෽���������쳣,�ͱ���Ҫ����try����.���Բ����׳�.
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
