package com.zengyin.practiceIO02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 通过缓冲区复制一个.java文件
 * 
 * **/
public class CopyTestBuffered {

	public static void main(String[] args) {
		
		
		copy_02();
		
		
		
		
		
		
	}

	public static void copy_02() {
		//1.源
		FileReader fr = null;
		BufferedReader bufr = null;
		//2.目的地
		FileWriter fw = null;
		BufferedWriter bufw=null;
		try {
			fr = new FileReader("src/com/zengyin/practiceIO01/TestIO02.java");
			bufr = new BufferedReader(fr);
			try {
				fw = new FileWriter("TestIO02_copy.txt");
				bufw = new BufferedWriter(fw);
				//3.操作
				String line = null ;
				while((line = bufr.readLine() )!= null){
					bufw.write(line);
					
					bufw.newLine();
					
					bufw.flush();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			//4.释放
			if(bufr!=null)
				try {
					bufr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			if(bufw!=null)
				try {
					bufw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
	}

}
