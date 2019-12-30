package com.zengyin.practiceIo;

import java.io.File;

/**
 *  
 *  mkdir()  :创建此抽象路径名指定的目录。(父目录或上一级目录必须存在,如果不存在创建失败)
 *  mkdirs()  :创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
 *             (如果父目录不存在会创建父目录)  推荐使用
 *             
 *  list()  :返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
 *           (列出下级目录名称,返回一个容器,是一个数组,只返回一层)
 *  listFiles()  :返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
 *                (列出下级File对象)
 *  列出所有盘符
 *  listRoots()  :列出可用的文件系统根。(根录经)
 * */
public class DemoDir01 {

	public static void main(String[] args) {
		/*File dir = new File("D:/workspace/base_Class_Demo/dir/test/day");
		boolean flag =dir.mkdirs();
		System.out.println(flag);*/
		
		//列出下一级名称
		File dir2 = new File("D:/workspace/base_Class_Demo");
		String[] subNames = dir2.list();
		for(String s : subNames){
			System.out.println(s);
		}
		
		//列出下一级对象
		File[] subFiles = dir2.listFiles();
		for(File s : subFiles){
			System.out.println(s);
		}
		
		/*File[] roots = dir2.listRoots();
		for(File f: roots ){
			System.out.println(f);
		}*/
	}

}
