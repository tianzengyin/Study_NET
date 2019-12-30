package com.zengyin.practiceIO04;

import java.io.*;


/**
 * 
 * 演示Mp3的复制,通过缓冲区
 * 
 * */
public class CopyMp3 {

	public static void main(String[] args) throws IOException {
		long start1 = System.currentTimeMillis();
		copyMp3_1();
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
		long start2 = System.currentTimeMillis();
		copyMp3_2();
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);
	}
   //通过字节流的缓冲区完成字节流的复制
	public static void copyMp3_1() throws IOException{
		//1.源
		InputStream is = new FileInputStream("王玉萌-浪子回头.mp3");
		//2.目的地
		OutputStream os = new FileOutputStream("王玉萌-浪子回头_copy.mp3");
		//3.操作
		//加入缓冲字节流
		FilterInputStream fls = new BufferedInputStream(is);
		FilterOutputStream fos = new BufferedOutputStream(os);
		int len = -1;
		byte[] b = new byte[1024];
		while((len = fls.read(b))!=-1){
		
			fos.write(b,0,len);
			fos.flush();
		}
		//4.释放资源
		fls.close();
		fos.close();
	}
	public static void copyMp3_2() throws IOException{
		//1.源
		InputStream is = new FileInputStream("王玉萌-浪子回头.mp3");
		//2.目的地
		OutputStream os = new FileOutputStream("王玉萌-浪子回头_copy.mp3");
		//3.操作
		//加入缓冲字节流
		FilterInputStream fls = new BufferedInputStream(is);
		FilterOutputStream fos = new BufferedOutputStream(os);
		int len = -1;
		//byte[] b = new byte[1024];
		while((len = fls.read())!=-1){
		
			fos.write(len);
		}
		//4.释放资源
		fos.close();
		fls.close();
	}
	
}
