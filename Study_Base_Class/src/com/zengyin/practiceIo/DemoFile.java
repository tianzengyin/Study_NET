package com.zengyin.practiceIo;

import java.io.File;

/**
 * 名称或路径
 * getName()  : 返回由此抽象路径名表示的文件或目录的名称。
 * getPath()  :将此抽象路径名转换为一个路径名字符串。(根据构建的File对象返回相对或绝对路径)
 * getAbsolutePath()  :返回此抽象路径名的绝对路径名字符串。(返回绝对路径)
 * getParent()  ;返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
 *              (返回名称分隔符的前面部分)
 * 
 * 
 * */
public class DemoFile {

	public static void main(String[] args) {
		File src = new File("D:/workspace/base_Class_Demo/meitu.jpg");//D:/workspace/base_Class_Demo/
		System.out.println("名称" + src.getName());
		System.out.println("路径" + src.getPath());
		System.out.println("绝对路径" + src.getAbsolutePath());
		System.out.println("父路径"  + src.getParent());
		System.out.println("父对象" + src.getParentFile().getName());
		
	}

}
