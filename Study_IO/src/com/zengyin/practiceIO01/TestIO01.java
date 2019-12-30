package com.zengyin.practiceIO01;

import java.io.File;   
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 第一个程序:理解操作步骤
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * 
 * */
public class TestIO01 {

	public static void main(String[] args) throws IOException  {
		/*for(int  i =1 ;i<=9;i++){
			for(int j = 1;j<i;j++){
				System.out.print(j + "*" + i + "="+ j*i + " ");
			}
			System.out.println();
		}*/
		//char ch = 'F';
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		//int ch = sc.nextInt();
		System.out.println("请输入字符:");
		String ch1 =sc.next();
		
		System.out.println(ch1);
		
		char ch = ch1.charAt(2);
		System.out.println(ch);
		//System.out.println(a);
		for(int i = 0;i<=ch - 'A';i++){
			for(int j = 0;j < i;j++){
				System.out.print("_");
			}
			for(int j = 0; j<=i;j++){
				
				System.out.print((char)(ch-j));
			}
			System.out.println();
		}
	}

	public static void demo01() {
		//1.创建源
		File src =  new File("abc.txt");
		//2.选择流
		InputStream is = null;
		try {
			 is = new FileInputStream(src);
			//3.操作（读取）
			int temp;
			while((temp = is.read()) != -1){
				System.out.print((char)temp);
			}
			
			/*int data1 = is.read();//第一个数据h
			int data2 = is.read();//第二个数据e
			int data3 = is.read();//第二个数据l
			int data4 = is.read();//第二个数据l
			int data5 = is.read();//第二个数据o
			int data6 = is.read();//???不是数据,文件的末尾返回-1
			System.out.print((char)data1);
			System.out.print((char)data2);
			System.out.print((char)data3);
			System.out.print((char)data4);
			System.out.print((char)data5);
			System.out.print(data6);*/
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			//4.释放资源
			try {if(is!=null){
				is.close();
			}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
