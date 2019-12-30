package com.zengyin.practiceIo;

import java.io.File;

/**
 * 
 * 文件状态
 * 1.不存在: exists true为存在  flase为不存在
 * 2.存在 :
 *       文件
 *       文件夹
 * 
 * */
public class DemoFile2 {

	public static void main(String[] args) {
        File src = new File("D:/workspace/base_Class_Demo/meitu.jpg");
        System.out.println("是否存在:" + src.exists());
        System.out.println("是否文件:" + src.isFile());
        System.out.println("是否文件夹:" + src.isDirectory());
        
        System.out.println("-----------------");
        
        src = new File("base_Class_Demo/meitu.jpg");
        System.out.println("是否存在:" + src.exists());
        System.out.println("是否文件:" + src.isFile());
        System.out.println("是否文件夹:" + src.isDirectory());
        
        System.out.println("-----------------");
        
        src = new File("meitu.jpg");
        System.out.println("是否存在:" + src.exists());
        System.out.println("是否文件:" + src.isFile());
        System.out.println("是否文件夹:" + src.isDirectory());
        
        src = new File("D:/workspace/base_Class_Demo");
        System.out.println("是否存在:" + src.exists());
        System.out.println("是否文件:" + src.isFile());
        System.out.println("是否文件夹:" + src.isDirectory());
        
        //文件状态
        src = new File("xxx");
        if(null == src || !src.exists()){
        	System.out.println("文件不存在");
        }else{
        	if(src.isFile()){
        		System.out.println("文件操作");
        	}else{
        		System.out.println("文件夹操作");
        	}
        }
	}

}
