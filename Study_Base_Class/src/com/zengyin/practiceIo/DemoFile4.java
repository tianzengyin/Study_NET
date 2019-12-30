package com.zengyin.practiceIo;

import java.io.File;
import java.io.IOException;

/**
 * 其他信息
 * createNewFile()  :当且仅当不存在具有此抽象路径名指定名称的文件时，
 *                   不可分地创建一个新的空文件。(不存在才创建返回true,存在不创建返回false)
 * delete()  :删除此抽象路径名表示的文件或目录。
 * 
 * */
public class DemoFile4 {

	public static void main(String[] args) throws IOException {
		File src = new File("D:/workspace/base_Class_Demo/io.txt");
	    boolean flag = src.createNewFile();
	    System.out.println(flag);
	    flag = src.delete();
	    System.out.println(flag);
	    
	    //不是文件夹
	    src = new File("D:/workspace/base_Class_Demo2");
	    flag = src.createNewFile();
	    System.out.println(flag);
	    flag = src.delete();
	    System.out.println(flag);
	    
	    //补充: con con3....操作系统的设备名,不能正确创建
	    src = new File("D:/workspace/base_Class_Demo/con");
	    src.createNewFile();
	}

}
