package com.zengyin.practiceIo;

import java.io.File;

/**
 *  ����File����
 *  
 *  ���·�������·��
 *  1.�����̷�:����·��
 *  2.�������̷�:���·��
 * 
 * */
public class TsetFile {

	public static void main(String[] args) {
		String path = "D:/workspace/base_Class_Demo/meitu.jpg";
		
		//1.����File����  ֱ�Ӷ���һ��·������
		File src = new File(path);
		System.out.println(src.length());
		
		//2.����File����  ���ӹ���
		src = new File("D:/workspace/base_Class_Demo" , "meitu.jpg");
		src = new File("D:/workspace" , "base_Class_Demo/meitu.jpg");
		System.out.println(src.length());
		
		//3.����File����  ������,������
		src = new File(new File("D:/workspace/base_Class_Demo") , "meitu.jpg");
		System.out.println(src.length());
		
		
	}
}
