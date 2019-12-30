package com.ioTest03;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: 随机读取和写入流RandomAccessFile
 * @VERSION:1.0
 */
public class RandTest01 {
    public static void main(String[] args) throws IOException {
        //Test01();
        RandomAccessFile raf = new RandomAccessFile(new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\ioTest03\\RandTest01.java"),"r");
        //起始位置
        int beginPos = 2;
        //实际大小
        int actualSize = 1026;
        //随机读取
        raf.seek(2);
        byte[] flush = new byte[1024];
        int len =-1;
        while((len=raf.read(flush))!=-1){

            if (actualSize>len){//获取本次读取的所有内容
                System.out.println(new String(flush,0,flush.length));
                actualSize -= len;
            }else{
                System.out.println(new String(flush,0,actualSize));
                break;
            }
        }
        raf.close();
    }
    //  指定起始位置，读取剩余所有内容
    private static void Test01() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\abc.txt"),"r");
        //随机读取
        raf.seek(2);
        byte[] flush = new byte[1024];
        int len =-1;
        while((len=raf.read(flush))!=-1){
            System.out.println(new String(flush,0,flush.length));
        }
        raf.close();
    }

}
