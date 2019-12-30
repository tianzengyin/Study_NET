package com.zengyin.practiceIo;

import java.io.File;

/**
 *  构建File对象
 *  
 *  相对路径与绝对路径
 *  1.存在盘符:绝对路径
 *  2.不存在盘符:相对路径
 * 
 * */
public class TsetFile {

	public static void main(String[] args) {
		String path = "D:/workspace/base_Class_Demo/meitu.jpg";
		
		//1.构建File对象  直接丢进一个路径名称
		File src = new File(path);
		System.out.println(src.length());
		
		//2.构建File对象  父子构建
		src = new File("D:/workspace/base_Class_Demo" , "meitu.jpg");
		src = new File("D:/workspace" , "base_Class_Demo/meitu.jpg");
		System.out.println(src.length());
		
		//3.构建File对象  父对象,子名称
		src = new File(new File("D:/workspace/base_Class_Demo") , "meitu.jpg");
		System.out.println(src.length());
		
		
	}
}
