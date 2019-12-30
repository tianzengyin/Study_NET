package com.sxt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 应用反射的API，获取类的信息(类的名字、属性、方法、构造器等)
 * @author www.sxt.cn
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		String path = "com.sxt.test.bean.User";
		
		try {
			Class clazz = Class.forName(path);
			

			System.out.println(clazz.getName());//获取类名+包名 com.sxt.test.bean.User
			System.out.println(clazz.getSimpleName());	//获取类名User
			
			//获取属性信息
//			Field[] fields = clazz.getFields(); //ֻ只能获得public的field
			Field[] fields = clazz.getDeclaredFields();//获得所有的field
			Field f = clazz.getDeclaredField("uname");
			System.out.println(fields.length);
			for(Field temp:fields){
				System.out.println("字段："+temp);
			}
			//获取方法
			Method[] methods = clazz.getDeclaredMethods();
			Method m01 = clazz.getDeclaredMethod("getUname", null);
			//��������вΣ�����봫�ݲ������Ͷ�Ӧ��class����
			Method m02 = clazz.getDeclaredMethod("setUname", String.class); 
			for(Method m:methods){
				System.out.println("方法："+m);
			}
			
			//��ù�������Ϣ
			Constructor[] constructors = clazz.getDeclaredConstructors();
			Constructor constructor = clazz.getConstructor();
			System.out.println("无参构造器 = " + constructor.getName());
			Constructor c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
			System.out.println("有参构造器："+c);
			for(Constructor temp:constructors){
				System.out.println("所有构造器："+temp);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
