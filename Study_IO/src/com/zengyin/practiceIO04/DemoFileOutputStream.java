package com.zengyin.practiceIO04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 *字节流:
 *InputStream  读
 *OutputStream  写
 *需求,想要操作图片数据,这是就要用到字节流.
 * 
 * */
public class DemoFileOutputStream {

	public static void main(String[] args) throws IOException {
		
	}

	public static void demo3() throws FileNotFoundException, IOException {
		FileInputStream fr = new FileInputStream("TestIO02_copy.txt");
		//int num = fr.available();定义一个刚刚好的缓冲区,不用循环
		byte[] buf = new byte[fr.available()];
		fr.read(buf);
		//String str = new String(buf);
		System.out.println(new String(buf));
	}

	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fr = new FileInputStream("TestIO02_copy.txt");
		byte[] b = new byte[1024];
		int len = -1;
		while((len=fr.read(b))!=-1){
			String str = new String(b,0,len);
			System.out.println(str);
		}
		fr.close();
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fr = new FileInputStream("TestIO02_copy.txt");
		//byte[]b = 0;
		int len =-1;
		while((len=fr.read())!=-1){
			System.out.print((char)len);
		}
		fr.close();
	}

}
