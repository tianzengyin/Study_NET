package com.zengyin.practiceIo;

import java.io.File;

/**
 *  
 *  mkdir()  :�����˳���·����ָ����Ŀ¼��(��Ŀ¼����һ��Ŀ¼�������,��������ڴ���ʧ��)
 *  mkdirs()  :�����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��
 *             (�����Ŀ¼�����ڻᴴ����Ŀ¼)  �Ƽ�ʹ��
 *             
 *  list()  :����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��
 *           (�г��¼�Ŀ¼����,����һ������,��һ������,ֻ����һ��)
 *  listFiles()  :����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ���
 *                (�г��¼�File����)
 *  �г������̷�
 *  listRoots()  :�г����õ��ļ�ϵͳ����(��¼��)
 * */
public class DemoDir01 {

	public static void main(String[] args) {
		/*File dir = new File("D:/workspace/base_Class_Demo/dir/test/day");
		boolean flag =dir.mkdirs();
		System.out.println(flag);*/
		
		//�г���һ������
		File dir2 = new File("D:/workspace/base_Class_Demo");
		String[] subNames = dir2.list();
		for(String s : subNames){
			System.out.println(s);
		}
		
		//�г���һ������
		File[] subFiles = dir2.listFiles();
		for(File s : subFiles){
			System.out.println(s);
		}
		
		/*File[] roots = dir2.listRoots();
		for(File f: roots ){
			System.out.println(f);
		}*/
	}

}
