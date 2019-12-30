package com.zengyin.practiceIo;

import java.io.File;

/**
 * 使用面对对象统计文件夹大小
 * 
 * */
public class DirCount {
	//大小
	private long len;
	//文件夹路径
	private String path;
	//源
	private File src;
	//文件夹个数
	private int dirSize;
	//文件个数
	private int fileSize;
	public DirCount(String path) {
		super();
		this.path = path;
		this.src = new File(path);
		count(this.src);
	}

	public long getLen() {
		return len;
	}


	public int getDirSize() {
		return dirSize;
	}


	public int getFileSize() {
		return fileSize;
	}


	public static void main(String[] args) {
		DirCount dir = new DirCount("D:/workspace/base_Class_Demo");
		
		System.out.println(dir.getLen()+"--->"+dir.getDirSize()+"--->"+dir.getFileSize());
		
		
		DirCount dir2 = new DirCount("D:/workspace/base_Class_Demo/src");
		
		System.out.println(dir2.getLen()+"--->"+dir2.getDirSize()+"--->"+dir2.getFileSize());
	}
	private void count(File src){
		
		//获取大小
		if(src != null && src.exists()){//递归头
			if(src.isFile()){//如果是文件
				len +=src.length();
				this.fileSize++;
			}else {  //子孙级,如果是目录
				this.dirSize++;
				for(File s : src.listFiles()){
					count(s);
				}
			}
		}
	}
}
