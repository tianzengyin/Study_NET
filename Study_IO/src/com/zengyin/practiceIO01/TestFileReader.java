package com.zengyin.practiceIO01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 读取一个.java文件,并打印在控制台上
 * 
 * **/
public class TestFileReader {

	public static void main(String[] args) {
		FileReader fr=null;
		try 
		{
			fr = new FileReader("src/com/zengyin/practiceIO01/TestIO01.java");
			char[] cbuf = new char[1024*2];
			
			try {
				int len = -1;
				while((len = fr.read(cbuf))!=-1){
                     String str = new String(cbuf,0,len);     
					System.out.println(str);
                          }
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			try{
				if(fr!=null)
				fr.close();
				
			}catch(IOException e){
				e.printStackTrace();
			}
				
		}
		
		
	}

}
