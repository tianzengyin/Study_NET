package com.zengyin.practiceIo;

import java.io.File;


/**
 * 递归:方法自己调用自己(在数据结构里叫做压栈,比较占用内存)
 * 递归头:何时结束递归
 * 递归体:重复调用
 * 
 * 打印子孙级目录和文件的名称
 * */
public class DemoDir02 {

	public static void main(String[] args) {
		File src = new File("D:/workspace/base_Class_Demo/src/com/zengyin/");
		printName(src,0);
	}
	
	// 打印子孙级目录和文件的名称
	public static void printName(File src, int deep){
		//System.out.println(src.getAbsolutePath());
		//控制前面层次感
		for(int i = 0;i<deep;i++){
			System.out.print("-");
		}
		//打印名称
		System.out.println(src.getName());
		//递归体和递归头
		if(null == src || !src.exists()){//递归头
			return;
		}else if(src.isDirectory()){ //如果是目录 
			for(File s : src.listFiles()){
				printName( s,deep+1);//递归体
			}
		}
		
	}
	
	
	public static void printTen(int num){
		if(num > 10){
			return;
		}
		System.out.println(num);
		printTen(num + 1);
	}

}
