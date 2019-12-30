package com.zengyin.SystremTest;

import java.util.Properties;

/**
 * System:类中的方法和属性都是静态的
 *   out : 标准输出 默认是屏幕
 *   in : 标准输入 默认是键盘
 *   
 * 描述系统一些信息
 * 获取系统属性信息:Properties getProperties();
 * 
 * */
public class SyatemTest01 {

	public static void main(String[] args) {
		//Properties prop = System.getProperties();
		//因为Properties是Hashtable的子类,也就是map集合的一个子类对象
		//那么可以通过Map方法取出该集合中的元素.
		
		/*获取属性所有信息
		for(Object obj : prop.keySet()){
			String value = (String)prop.get(obj);
			System.out.println(obj+".."+value);
		}
		*/
		
		//获取指定属性信息
		String value = System.getProperty("os.name");
		sop(value);
		
	}
	 public static void sop(Object obj){
		 System.out.println(obj);
	 }
}
