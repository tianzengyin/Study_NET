package com.File;

import java.io.File;

/**
 * @Auther:田增印
 * @Date: 2019/4/22
 * @Description: com.File
 * @VERSION:1.0
 */
public class Demo03File {
    private static long length = 0;
    public static void main(String[] args){
//    show01();
//      show02();

        File file = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com");
//        getAllFiles(file);
        long lengthFiles = getLengthFiles(file);
        System.out.println(lengthFiles);
    }
    public static long getLengthFiles(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                getLengthFiles(file1);
            }else{
                length +=file1.length();
            }
        }
        return length;
    }
    public static void getAllFiles(File dir){
//        System.out.println("dir = " + dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFiles(file);
            }else{
               /**
                 *只要.java结尾的文件
                 * 1.把file对象转换为字符串对象
                 * 2.调用String类中的方法endsWith判断字符串是否以.java结尾
                 * */
                String fileName = file.getName();
                fileName = fileName.toLowerCase();//转换为小写
                if(fileName.endsWith(".java")){
                    System.out.println("file = " + file);
                }
            }
        }
    }
    private static void show02() {
        File file = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\File");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println("file1 = " + file1);
        }
    }

    private static void show01() {
        File file = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\File");
        String[] list = file.list();
        for (String s : list) {//快捷键：iter
            System.out.println("s = " + s);
        }
        /*for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }*/
    }
}
