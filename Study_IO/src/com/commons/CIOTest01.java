package com.commons;


import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * @Auther:田增印
 * @Date: 2019/5/1
 * @Description: com.commons 统计大小
 * @VERSION:1.0
 */
public class CIOTest01 {

    public static void main(String[] args) {
        //文件大小
        Long len = FileUtils.sizeOf(new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\commons\\CIOTest01.java"));
        System.out.println("len = " + len);
        //目录大小
        long l1 = FileUtils.sizeOf(new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file"));
        System.out.println("l1 = " + l1);
    }
}
