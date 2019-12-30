package com.zengyin.practiceIO01;
import java.io.*;
public class DemoFileReader01 {

	public static void main(String[] args) {
		FileReader fr=null;
		try {
			//创建一个文件读取流对象,和指定名称的文件相关联
			//要保证该文件已经存在,若不存在,会发生异常,FileNotFoundException
			fr = new FileReader("abc.txt");
			try {
				/*int ch;
				while((ch=fr.read()) != -1){
					System.out.print((char)ch);	
				}*/
				char[] cbuf = new char[1024];//utf-8中一个中文字符占3个字节,
				                             //1024即1024*3=3kb
				
				/*int num =fr.read(cbuf);
				System.out.print(num+new String(cbuf));//3,天津职
				
				int num1 = fr.read(cbuf);
				System.out.print(num1+new String(cbuf));//3,业技术
				int num2 = fr.read(cbuf);
				System.out.print(num2+new String(cbuf));//3,师范大
				int num3 = fr.read(cbuf);
				System.out.print(num3+new String(cbuf,0,num3));//1,学范大*/
				int len =-1;
				//int ch = fr.read(cbuf);
				while((len=fr.read(cbuf))!=-1){
					String str = new String(cbuf,0,len);
					System.out.print(str);
				}
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			try {  
				if(fr!=null)
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
