package com.sxt.test;

import com.sxt.test.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ͨ������API��̬�Ĳ�����������������������
 * @author ��ѧ�ø�� www.sxt.cn
 *
 */
public class Demo03 {
	public static void main(String[] args) {

		String path = "com.sxt.test.bean.User";
		
		try {
			Class<User> clazz = (Class<User>) Class.forName(path);
			
			//ͨ������API���ù��췽�����������
			User u = clazz.newInstance();	//��ʵ�ǵ�����User���޲ι��췽��
			System.out.println(u);
			
			Constructor<User> c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
			User u2 = c.newInstance(1001,18,"aaa");
			System.out.println(u2.getUname());
			
			//ͨ������API������ͨ����
			User u3 = clazz.newInstance();
			Method method = clazz.getDeclaredMethod("setUname", String.class);
			method.invoke(u3, "bbb");   //u3.setUname("�����");
			System.out.println(u3.getUname());
			
			//ͨ������API��������
			User u4 = clazz.newInstance();
			Field f = clazz.getDeclaredField("uname");
			f.setAccessible(true); //������Բ���Ҫ����ȫ����ˣ�����ֱ�ӷ���
			f.set(u4, "ccc");		//ͨ������ֱ��д����
			System.out.println(u4.getUname());	//ͨ������ֱ�Ӷ����Ե�ֵ
			System.out.println(f.get(u4));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}
