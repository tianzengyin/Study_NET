package com.zengyin.practiceIO02;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;



/**
 * 
 * 字符流读取缓冲区
 * 
 * */
public class DemoBuferedReader {

	public static void main(String[] args) throws IOException {
		//创建一个读取流对象和文件相关联
		FileReader fr = new FileReader("TestIO01_copy.txt");
		//为了提高效率,加入缓冲技术,将字符读取流对象作为参数传递给缓冲对象的构造函数
		BufferedReader bufr = new BufferedReader(fr);
		String line ;
		while((line= bufr.readLine())!=null){
			System.out.println(line);
		}
		
		System.out.println(line);
		/*char[] cbuf = new char[3];
		int len = -1;
		while((len=bufr.read(cbuf))!=-1){
			String str = new String(cbuf,0,len);
			//bufr.readLine();
			System.out.print(str);
			
		}*/
		bufr.close();
		
		
	}

}
