package com.zengyin.practiceIO01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 
 * 字符流和字节流
 * 字节流两个基类
 * InputStream OutputStream
 * 
 * 字符流两个基类
 * Reader Writer
 * 
 * 字符流特点:FileWriter,专门用于操作文件的Writer子类对象.
 *         后缀名是父类名,前缀名该流对象的功能.
 *         
 * 
 * */
public class DemoFileWriter01 {

	public static void main(String[] args) throws IOException {
		/*Writer w = new FileWriter("abc.txt");
		w.append('b');
		w.flush();
		w.close();*/
		//创建一个FileWriter对象,该对象一被初始化就必须要明确操作的文件
		//而且该文件会被创建到指定目录下,如果该目录下已有同名文件,将被覆盖
		//明确数据要存放的目的地
		FileWriter fw =new FileWriter("abc.txt");
		//调用Writer方法,将字符串写入到流中
		fw.write("大家好,我是砸砸辉");
		//刷新流对象中的缓冲中的数据
		//将数据刷到目的地中
		fw.flush();
		fw.write("abc");
		fw.flush();
		//关闭流资源,但是关闭之前会刷新一遍内部的缓冲中的数据
		//将数据刷新到目的地
		//和flush的区别:flush刷新后,流可以继续使用,close刷新后会将流关闭
		fw.close();
		
	}

}
