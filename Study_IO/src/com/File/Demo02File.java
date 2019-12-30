package com.File;

import java.io.File;

/**
 * @Auther:田增印
 * @Date: 2019/4/22
 * @Description: com.File
 * @VERSION:1.0
 */
public class Demo02File {
public static void main(String[] args){
/**
 * file类的构造方法
 * */
//show01();
show02("c:\\","c.txt");
}
   //File(String parent, String child)
    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println("file = " + file);
    }

    //    File(String pathname)
    private static void show01() {
        File file = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\File\\a.txt");
        System.out.println("file = " + file);//
        File file1 = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\File");
        System.out.println("file1 = " + file1);
    }

}
