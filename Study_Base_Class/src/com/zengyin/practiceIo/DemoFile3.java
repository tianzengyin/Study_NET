package com.zengyin.practiceIo;

import java.io.File;

/**
 * 其他信息
 * length()  :返回由此抽象路径名表示的文件的长度。(文件的字节数)
 * 
 * 
 * **/
public class DemoFile3 {

	public static void main(String[] args) {
		File src = new File("D:/workspace/base_Class_Demo/meitu.jpg");
		System.out.println("长度" + src.length());
		
		src = new File("D:/workspace/base_Class_Demo");
		System.out.println("长度" + src.length());
	}

}
