package com.zengyin.practiceIo;

import java.io.File;


/**
 * �ݹ�:�����Լ������Լ�(�����ݽṹ�����ѹջ,�Ƚ�ռ���ڴ�)
 * �ݹ�ͷ:��ʱ�����ݹ�
 * �ݹ���:�ظ�����
 * 
 * ��ӡ���ＶĿ¼���ļ�������
 * */
public class DemoDir02 {

	public static void main(String[] args) {
		File src = new File("D:/workspace/base_Class_Demo/src/com/zengyin/");
		printName(src,0);
	}
	
	// ��ӡ���ＶĿ¼���ļ�������
	public static void printName(File src, int deep){
		//System.out.println(src.getAbsolutePath());
		//����ǰ���θ�
		for(int i = 0;i<deep;i++){
			System.out.print("-");
		}
		//��ӡ����
		System.out.println(src.getName());
		//�ݹ���͵ݹ�ͷ
		if(null == src || !src.exists()){//�ݹ�ͷ
			return;
		}else if(src.isDirectory()){ //�����Ŀ¼ 
			for(File s : src.listFiles()){
				printName( s,deep+1);//�ݹ���
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
