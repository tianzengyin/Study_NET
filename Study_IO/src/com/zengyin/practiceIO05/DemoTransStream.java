package com.zengyin.practiceIO05;

import java.io.*;


public class DemoTransStream {
	public static void main(String[] args) throws IOException{
		//��ȡ����¼�����
		InputStream in = System.in;
		//���ֽ�������ת�����ַ�������,ʹ��ת����,InputStreamReader
		InputStreamReader isr = new InputStreamReader(in);
		//Ϊ�����Ч��,���ַ������л�����������Ч����,ʹ��Bufferedreader
		BufferedReader bufr = new BufferedReader(isr);
		String line = null;
		while((line = bufr.readLine())!= null){
			System.out.println(line.toUpperCase());
		}
		bufr.close();
	}
}
