package com.zengyin.RuntimeTest;

import java.io.IOException;

/**
 * Runtime ����
 * ���ಢû���ṩ���췽��
 * ˵��������ֱ��new ����,��ô��ֱ���뵽�����еķ������Ǿ�̬��
 * ���ָ�����Ҳ���зǾ�̬����
 * ˵��������ṩһ��������ȡ�������,���Ҹö����Ǿ�̬��,������ֵ�����Ǳ�������
 * 
 * ������ص���Կ�������ʹ���˵������ģʽ
 * 
 * �÷�ʽ��static Runtime getRuntime();
 * 
 * */
public class RuntimeTest01 {

	public static void main(String[] args)throws IOException {
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("notepad.exe  RuntimeTest01.java");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p.destroy();*/
	}

}
