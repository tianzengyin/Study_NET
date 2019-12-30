package com.zengyin.practiceIO01;
import java.io.*;
public class DemoFileWriter02 {

	public static void main(String[] args) {
		FileWriter fw=null;//在外边建立引用,在try里进行初始化
		try {
			//如果下面一句出现异常,代表文件没有创建成功,
			//fw为null,不能调用close()方法
			fw = new FileWriter("abc.txt");
			fw.write("abcdef");
			fw.flush();
			fw.write(97);
			fw.flush();
			
		} catch (IOException e) {
			
			System.out.println("catch:"+ e.toString());
		}finally{
			try {if(fw!=null){
				fw.close();				
			}
			} catch (IOException e) {
				
				System.out.println(e.toString());
			}
		}
	}

}
