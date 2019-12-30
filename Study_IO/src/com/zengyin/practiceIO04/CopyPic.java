package com.zengyin.practiceIO04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * 复制一个图片
 * 思路:
 * 1.用字节读取流对象和图片关联
 * 2.用字节写入流对象创建图片文件,用于存储获取到的图片资源
 * 3.通过循环读写,完成数据的存储
 * 4.释放资源
 * 
 * */
public class CopyPic {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("meitu.jpg");
			os = new FileOutputStream("meitu_copy.jpg");
			byte[] buf = new byte[1024];
			int len = -1;
			try {
				while((len= is.read(buf))!=-1){
					os.write(buf,0,len);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			if(is!=null)
				try {
					is.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			if(os!=null)
				try {
					os.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
		
		
		
	}

}
