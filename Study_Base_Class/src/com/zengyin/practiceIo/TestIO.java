package com.zengyin.practiceIo;

import java.io.File;

public class TestIO {
	/**
	 * 常量
	 * 路径分隔符pathSeparator
	 * 名称分隔符separator
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		System.out.println(File.pathSeparator);//输出;
		System.out.println(File.separator);//输出\
		/**
		 *   \ 或 /(不同平台名称分隔符不一样)  名称分隔符 separator
		 *   
		 * */
		String path = "D:\\workspace\\base_Class_Demo\\meitu.jpg";
		/**
		 * 路径的三种写法
		 * 1.  /
		 * path = "D:/workspace/base_Class_Demo/meitu.jpg";  一般使用第一种
		 * 
		 * 2.常量拼接
		 * path = "D:" + File.separator + "workspace" + File.separator + "base_Class_Demo" 
		 *             + File.separator + "meitu.jpg";
		 * 
		 * 3.\\
		 * path = "D:\\workspace\\base_Class_Demo\\meitu.jpg";
		 * 
		 * */
		System.out.println(File.pathSeparatorChar);//输出;
		
		path = "D:" + File.separator + "workspace" + File.separator + "base_Class_Demo" 
	                + File.separator + "meitu.jpg";
		System.out.println(path);
	}

}
