package com.zengyin.practiceIo;

import java.io.File;


/**
 *  相对路径与绝对路径
 *  1.存在盘符:绝对路径
 *  2.不存在盘符:相对路径
 * 
 * */
public class TestFile2 {

	public static void main(String[] args) {
		String path = "D:/workspace/base_Class_Demo/meitu.jpg";
		
		//绝对路径
		File src = new File(path);
		System.out.println(src.getAbsolutePath());
		
		//相对路径
		System.out.println(System.getProperty("user.dir"));//用户目录,相对当前工程
		src = new File("meitu.jpg");
		System.out.println(src.getAbsolutePath());
		
		//构建一个不存在的路径
		src = new File("aaa/meitu.jpg");
		System.out.println(src.getAbsolutePath());
	}

}
