package com.zengyin.practiceIo;

import java.io.UnsupportedEncodingException;

public class ContentDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "��������ʹ��a";
		//����:�ֽ�����
		byte[] datas = msg.getBytes();
		
		//����:�����ַ���
		 msg = new String(datas,0,datas.length,"gbk");
		 System.out.println(msg);
		 //����:
		 //1.�ֽ�������
		 msg = new String(datas,0,datas.length-2,"gbk");
		 System.out.println(msg);
		 msg = new String(datas,0,datas.length-1,"gbk");
		 System.out.println(msg);
		 //2.�ַ�����ͳһ
		 msg = new String(datas,0,datas.length-1,"utf-8");
		 System.out.println(msg);
		 
	}

}
