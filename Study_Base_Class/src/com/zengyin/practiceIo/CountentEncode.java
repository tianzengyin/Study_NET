package com.zengyin.practiceIo;

import java.io.UnsupportedEncodingException;

/**
 * ����:�ַ���--->�ֽ�,utf-8һ�������ַ�ռ�����ֽ�,Ӣ��ռһ���ֽ�
 *                 unicodeһ�������ַ�ռ�����ַ�
 * 
 * 
 * **/
public class CountentEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "��������ʹ��a";
		//����:�ֽ�����
		byte[] datas = msg.getBytes();
		System.out.println(datas.length);
		//����:�����ַ���
		 datas = msg.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		datas = msg.getBytes("GBK");
		System.out.println(datas.length);
	}

}
