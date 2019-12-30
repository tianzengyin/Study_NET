package com.sxt.test;

import com.sxt.test.bean.User;

import java.lang.reflect.Method;

/**
 * ????????????ï…??????§¹??
 * ??????§Ù?????§¹???????
 * 
 * @author ??????? www.sxt.cn
 *
 */
public class Demo06 {
	
	public static void test01(){
		User u = new User();
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000000L; i++) {
			u.getUname();
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("???????????????10??¦²??????"+(endTime-startTime)+"ms"); 
	}
	
	public static void test02() throws Exception{
		User u = new User();
		Class clazz = u.getClass();
		Method m = clazz.getDeclaredMethod("getUname", null);
//		m.setAccessible(true);
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000000L; i++) {
			m.invoke(u, null);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("?????????????????10??¦²??????"+(endTime-startTime)+"ms");
	}
	
	public static void test03() throws Exception{
		User u = new User();
		Class clazz = u.getClass();
		Method m = clazz.getDeclaredMethod("getUname", null);
		m.setAccessible(true);	//???????§Ù????????
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000000L; i++) {
			m.invoke(u, null);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("???????????????????????ï…???10??¦²??????"+(endTime-startTime)+"ms");
	}
	
	
	public static void main(String[] args) throws Exception {
		test01();
		test02();
		test03();
	}
}
