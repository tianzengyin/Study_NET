package com.zengyin.practiceIo;

import java.io.File;

/**
 * 
 * ͳ���ļ��Ĵ�С
 * */
public class DemoDir03 {

	public static void main(String[] args) {
		File src = new File("D:/workspace/base_Class_Demo/src");
		count(src);
		System.out.println(len);
	}
	private static long len = 0;
	public static void count(File src){
		
		//��ȡ��С
		if(src != null && src.exists()){//�ݹ�ͷ
			if(src.isFile()){
				len +=src.length();
			}else {  //���Ｖ
				for(File s : src.listFiles()){
					count(s);
				}
			}
		}
	}
}
