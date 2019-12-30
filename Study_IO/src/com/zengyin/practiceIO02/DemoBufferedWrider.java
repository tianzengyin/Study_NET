package com.zengyin.practiceIO02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 缓冲区的出现是为了提高流的操作效率而出现的
 * 所以在创建缓冲区之前,必须要先有流对象
 * 
 * 该缓冲区提供了一个跨平台的换行符
 * newLine();
 * 
 * */
public class DemoBufferedWrider {

	public static void main(String[] args) {
		//创建一个字符写入流对象
		File file = new File("buf.txt");
		FileWriter fw = null;
		BufferedWriter bufw =null;
		try {
			fw = new FileWriter(file,true);
			//为了提高字符写入流效率:加入了缓冲技术.
			//只要将需要被提高效率的流对象作为参数传递给缓冲区的构造函数即可
			bufw = new BufferedWriter(fw);
			for(int i =0;i<5;i++){
				bufw.write("天津职业技术师范大学"+i);
				bufw.newLine();
				//只要用到缓冲区,就要记得刷新
				bufw.flush();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			if(bufw!=null)
				try {
					bufw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
		
		
		
		
		
		
		
		
	}

}
