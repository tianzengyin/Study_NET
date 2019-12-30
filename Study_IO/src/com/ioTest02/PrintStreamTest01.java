package com.ioTest02;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: 打印流 PrintStream
 * @VERSION:1.0
 */
public class PrintStreamTest01 {
    public static void main(String[] args)throws Exception{
        //打印流System.out
        PrintStream ps = System.out;
        ps.println("打印流");
        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest.txt",true)));
        ps.println("打印流");
        //重定向输出端
        System.setOut(ps);
        System.out.println("change");
        //重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
        System.out.println("I am backing ....");
    }
}
