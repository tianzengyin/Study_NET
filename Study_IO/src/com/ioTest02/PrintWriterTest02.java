package com.ioTest02;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: 打印流 PrintWriter
 * @VERSION:1.0
 */
public class PrintWriterTest02 {
    public static void main(String[] args)throws Exception{

        PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest.txt",true)));
        pw.println("打印流");
        pw.println(true);
        pw.close();
    }
}
