package com.File;

import java.io.File;

/**
 * @Auther:田增印
 * @Date: 2019/4/22
 * @Description: com.File
 * @VERSION:1.0
 */
public class Demo01File {
   public static void main(String[] args){
       String pathSeparator = File.pathSeparator;
       System.out.println("pathSeparator = " + pathSeparator);//路径分隔符 windows:分好； Linux：冒号：
       String separator = File.separator;
       System.out.println("separator = " + separator);//文件分隔符 / \


   }


}
