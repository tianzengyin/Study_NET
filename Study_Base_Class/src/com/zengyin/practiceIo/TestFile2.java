package com.zengyin.practiceIo;

import java.io.File;


/**
 *  ���·�������·��
 *  1.�����̷�:����·��
 *  2.�������̷�:���·��
 * 
 * */
public class TestFile2 {

	public static void main(String[] args) {
		String path = "D:/workspace/base_Class_Demo/meitu.jpg";
		
		//����·��
		File src = new File(path);
		System.out.println(src.getAbsolutePath());
		
		//���·��
		System.out.println(System.getProperty("user.dir"));//�û�Ŀ¼,��Ե�ǰ����
		src = new File("meitu.jpg");
		System.out.println(src.getAbsolutePath());
		
		//����һ�������ڵ�·��
		src = new File("aaa/meitu.jpg");
		System.out.println(src.getAbsolutePath());
	}

}
