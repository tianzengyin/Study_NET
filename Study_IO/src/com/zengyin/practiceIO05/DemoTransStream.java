package com.zengyin.practiceIO05;

import java.io.*;


public class DemoTransStream {
	public static void main(String[] args) throws IOException{
		//获取键盘录入对象
		InputStream in = System.in;
		//将字节流对象转换成字符流对象,使用转换流,InputStreamReader
		InputStreamReader isr = new InputStreamReader(in);
		//为了提高效率,将字符串进行缓冲区技术高效操作,使用Bufferedreader
		BufferedReader bufr = new BufferedReader(isr);
		String line = null;
		while((line = bufr.readLine())!= null){
			System.out.println(line.toUpperCase());
		}
		bufr.close();
	}
}
