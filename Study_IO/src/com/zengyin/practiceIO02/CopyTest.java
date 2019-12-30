package com.zengyin.practiceIO02;
import java.io.*;
/**
 * 将c盘一个文件复制到D盘
 * 
 * 复制原理:
 * 将C盘文件下的文件数据存储到D盘的一个文件中.
 * 
 * 步骤:
 * 1.在D盘创建一个文件,用于存储C盘文件中的数据
 * 2.定义一个读取流和C盘关联
 * 3.通过不断的读写完成数据存储
 * 4.关闭资源
 * 
 * */
public class CopyTest {

	public static void main(String[] args) {
      copy_1();
	}
	//从C盘读一个字符,就往D盘写一个字符,拷贝
	public static void copy_1(){
		//创建目的地
		FileWriter  fw = null;//目的地
		FileReader fr = null;//源
		try{
			fw = new FileWriter("TestIO01_copy.txt");
			
			try {
				fr = new FileReader("src/com/zengyin/practiceIO01/TestIO01.java");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			int len = -1;
			char[] cbuf = new char[1024];
			while((len= fr.read(cbuf))!=-1){
				String str = new String(cbuf,0,len);
				fw.write(str);
				fw.flush();
			}
		}catch(IOException e){
			//throw new RuntimeException("读写失败");
			e.printStackTrace();
		}finally{
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			if(fr!= null)
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
		}
		//与已有文件关联
		
	}
}
