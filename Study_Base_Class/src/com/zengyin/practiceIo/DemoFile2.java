package com.zengyin.practiceIo;

import java.io.File;

/**
 * 
 * �ļ�״̬
 * 1.������: exists trueΪ����  flaseΪ������
 * 2.���� :
 *       �ļ�
 *       �ļ���
 * 
 * */
public class DemoFile2 {

	public static void main(String[] args) {
        File src = new File("D:/workspace/base_Class_Demo/meitu.jpg");
        System.out.println("�Ƿ����:" + src.exists());
        System.out.println("�Ƿ��ļ�:" + src.isFile());
        System.out.println("�Ƿ��ļ���:" + src.isDirectory());
        
        System.out.println("-----------------");
        
        src = new File("base_Class_Demo/meitu.jpg");
        System.out.println("�Ƿ����:" + src.exists());
        System.out.println("�Ƿ��ļ�:" + src.isFile());
        System.out.println("�Ƿ��ļ���:" + src.isDirectory());
        
        System.out.println("-----------------");
        
        src = new File("meitu.jpg");
        System.out.println("�Ƿ����:" + src.exists());
        System.out.println("�Ƿ��ļ�:" + src.isFile());
        System.out.println("�Ƿ��ļ���:" + src.isDirectory());
        
        src = new File("D:/workspace/base_Class_Demo");
        System.out.println("�Ƿ����:" + src.exists());
        System.out.println("�Ƿ��ļ�:" + src.isFile());
        System.out.println("�Ƿ��ļ���:" + src.isDirectory());
        
        //�ļ�״̬
        src = new File("xxx");
        if(null == src || !src.exists()){
        	System.out.println("�ļ�������");
        }else{
        	if(src.isFile()){
        		System.out.println("�ļ�����");
        	}else{
        		System.out.println("�ļ��в���");
        	}
        }
	}

}
