package com.zengyin.practiceIo;

import java.io.File;

public class TestIO {
	/**
	 * ����
	 * ·���ָ���pathSeparator
	 * ���Ʒָ���separator
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);//���;
		System.out.println(File.separator);//���\
		/**
		 *   \ �� /(��ͬƽ̨���Ʒָ�����һ��)  ���Ʒָ��� separator
		 *   
		 * */
		String path = "D:\\workspace\\base_Class_Demo\\meitu.jpg";
		/**
		 * ·��������д��
		 * 1.  /
		 * path = "D:/workspace/base_Class_Demo/meitu.jpg";  һ��ʹ�õ�һ��
		 * 
		 * 2.����ƴ��
		 * path = "D:" + File.separator + "workspace" + File.separator + "base_Class_Demo" 
		 *             + File.separator + "meitu.jpg";
		 * 
		 * 3.\\
		 * path = "D:\\workspace\\base_Class_Demo\\meitu.jpg";
		 * 
		 * */
		System.out.println(File.pathSeparatorChar);//���;
		
		path = "D:" + File.separator + "workspace" + File.separator + "base_Class_Demo" 
	                + File.separator + "meitu.jpg";
		System.out.println(path);
	}

}
