package com.demoFilter;

import java.io.File;

/**
 * @Auther:田增印
 * @Date: 2019/4/23
 * @Description: com.demoFilter
 * @VERSION:1.0
 */
public class Demo01Filter {
    public static void main(String[] args){
        File file = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
        /*File[] files = dir.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith(".java");

            }
        });//传递过滤器对象*/
        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/
        //使用Lambda表达式优化匿名内部类（接口中只有一个抽象方法）
        File[] files = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java"));
        //File[] files = dir.listFiles((File d, String name)->new File(d,name).isDirectory() || name.toLowerCase().endsWith(".java"));
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }else{
                System.out.println("file = " + file);
            }
        }
    }
}
