package com.demoFilter;

/**
 * @Auther:田增印
 * @Date: 2019/4/23
 * @Description: com.demoFilter
 * @VERSION:1.0
 */

import java.io.File;
import java.io.FileFilter;

/**
 * 创建过滤器FileFilter的实现类，重写过滤方法
 * */
public class FileFilterImpl implements FileFilter{

public static void main(String[] args){
    File file = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com");
    getAllFile(file);
}
    @Override
    public boolean accept(File pathname) {
        /**
         * 过滤的规则：
         *   在ACCEPT方法中。判断File对象是否是以.java结尾
         *   是返回true,否则返回false
         *   如果pathname是一个文件夹，返回true,继续遍历文件夹
         * */
         if(pathname.isDirectory()){
             return true;
         }
         return pathname.getName().toLowerCase().endsWith(".java");

    }
    public static void getAllFile(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());//传递过滤器对象
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else{
                System.out.println("file = " + file);
            }
        }
    }
}
