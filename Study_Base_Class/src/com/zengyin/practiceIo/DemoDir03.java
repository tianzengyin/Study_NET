package com.zengyin.practiceIo;

import java.io.File;

/**
 * 
 * 统计文件的大小
 * */
public class DemoDir03 {

	public static void main(String[] args) {
		File src = new File("D:/workspace/base_Class_Demo/src");
		count(src);
		System.out.println(len);
	}
	private static long len = 0;
	public static void count(File src){
		
		//获取大小
		if(src != null && src.exists()){//递归头
			if(src.isFile()){
				len +=src.length();
			}else {  //子孙级
				for(File s : src.listFiles()){
					count(s);
				}
			}
		}
	}
}
