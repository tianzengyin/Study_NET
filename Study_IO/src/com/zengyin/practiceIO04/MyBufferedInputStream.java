package com.zengyin.practiceIO04;
/**
 * 自定义一个字节缓冲流
 * */
import java.io.*;
public class MyBufferedInputStream {

	private InputStream in;
	
	private byte[] buf = new byte[1024*4];
	
	private int pos = 0 , count = 0;
	
	MyBufferedInputStream(InputStream in){
		this.in = in;
	}
	 public int myRead() throws IOException{
		//一次读一个字节,从字节流数组中读
		if( count == 0){
			count = in.read(buf);
			pos =0;
			 byte b =buf[pos];
			 count--;
			 pos++;
			 return b&255;
		}else if(count > 0){
			 byte b =buf[pos];
			 count--;
			 pos++;
			 return b&0xff;
		}
		return -1;
	 }
	 
	 public void myclose() throws IOException{
		in.close(); 
	 }
	 
	 public static void main(String[] args) throws IOException{
		long start = System.currentTimeMillis();
		copyMp3_1();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	 }
	 public static void copyMp3_1() throws IOException{
			//1.源
			InputStream is = new FileInputStream("王玉萌-浪子回头.mp3");
			//2.目的地
			OutputStream os = new FileOutputStream("王玉萌-浪子回头_copy.mp3");
			//3.操作
			//加入缓冲字节流
			MyBufferedInputStream fls = new MyBufferedInputStream(is);
			BufferedOutputStream fos = new BufferedOutputStream(os);
			int len = 0;
			//byte[] b = new byte[1024];
			while((len = fls.myRead())!=-1){
			
				fos.write(len);
				
				
			}
			//4.释放资源
			fos.close();
			fls.myclose();
			
			
		}
}
