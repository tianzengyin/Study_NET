package com.zengyin.practiceIo;

import java.io.File;
import java.io.IOException;

/**
 * ������Ϣ
 * createNewFile()  :���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ��
 *                   ���ɷֵش���һ���µĿ��ļ���(�����ڲŴ�������true,���ڲ���������false)
 * delete()  :ɾ���˳���·������ʾ���ļ���Ŀ¼��
 * 
 * */
public class DemoFile4 {

	public static void main(String[] args) throws IOException {
		File src = new File("D:/workspace/base_Class_Demo/io.txt");
	    boolean flag = src.createNewFile();
	    System.out.println(flag);
	    flag = src.delete();
	    System.out.println(flag);
	    
	    //�����ļ���
	    src = new File("D:/workspace/base_Class_Demo2");
	    flag = src.createNewFile();
	    System.out.println(flag);
	    flag = src.delete();
	    System.out.println(flag);
	    
	    //����: con con3....����ϵͳ���豸��,������ȷ����
	    src = new File("D:/workspace/base_Class_Demo/con");
	    src.createNewFile();
	}

}
