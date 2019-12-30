package com.zengyin.practiceIO01;
import java.io.*;
/**
 * 
 * 对已有文件进行续写
 * 
 * */
public class DemoFileWriter03 {

	public static void main(String[] args) {
		FileWriter fw =null;
		try {
			//传递一个true参数,代表不覆盖已有的文件,并在已有文件末尾处进行续写
			//如果文件不存在,则创建,反之,不创建
			fw = new FileWriter("abc.txt",true);
			String msg = "天津职业技术师范大学";
			char[] ch =msg.toCharArray();
			fw.write(ch);
			fw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
