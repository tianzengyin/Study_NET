package com.zengyin.practiceIo;

import java.io.File;

/**
 * ���ƻ�·��
 * getName()  : �����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ�
 * getPath()  :���˳���·����ת��Ϊһ��·�����ַ�����(���ݹ�����File���󷵻���Ի����·��)
 * getAbsolutePath()  :���ش˳���·�����ľ���·�����ַ�����(���ؾ���·��)
 * getParent()  ;���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null��
 *              (�������Ʒָ�����ǰ�沿��)
 * 
 * 
 * */
public class DemoFile {

	public static void main(String[] args) {
		File src = new File("D:/workspace/base_Class_Demo/meitu.jpg");//D:/workspace/base_Class_Demo/
		System.out.println("����" + src.getName());
		System.out.println("·��" + src.getPath());
		System.out.println("����·��" + src.getAbsolutePath());
		System.out.println("��·��"  + src.getParent());
		System.out.println("������" + src.getParentFile().getName());
		
	}

}
