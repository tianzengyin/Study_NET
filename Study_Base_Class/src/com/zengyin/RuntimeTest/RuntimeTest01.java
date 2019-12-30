package com.zengyin.RuntimeTest;

import java.io.IOException;

/**
 * Runtime 对象
 * 该类并没有提供构造方法
 * 说明不可以直接new 对象,那么会直接想到该类中的方法都是静态的
 * 发现该类中也还有非静态方法
 * 说明该类会提供一个方法获取本类对象,而且该对象是静态的,并返回值类型是本类类型
 * 
 * 有这个特点可以看出该类使用了单利设计模式
 * 
 * 该方式是static Runtime getRuntime();
 * 
 * */
public class RuntimeTest01 {

	public static void main(String[] args)throws IOException {
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("notepad.exe  RuntimeTest01.java");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p.destroy();*/
	}

}
