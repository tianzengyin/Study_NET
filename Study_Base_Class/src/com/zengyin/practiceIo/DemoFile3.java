package com.zengyin.practiceIo;

import java.io.File;

/**
 * ������Ϣ
 * length()  :�����ɴ˳���·������ʾ���ļ��ĳ��ȡ�(�ļ����ֽ���)
 * 
 * 
 * **/
public class DemoFile3 {

	public static void main(String[] args) {
		File src = new File("D:/workspace/base_Class_Demo/meitu.jpg");
		System.out.println("����" + src.length());
		
		src = new File("D:/workspace/base_Class_Demo");
		System.out.println("����" + src.length());
	}

}
