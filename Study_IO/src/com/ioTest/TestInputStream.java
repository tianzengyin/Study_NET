package com.ioTest;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/24
 * @Description: com.ioTest
 * @VERSION:1.0
 */
public class TestInputStream {
    public static void main(String[] args){
       // DemoInputStream01();
        //1.创建源
        File src = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest.txt");
        //2.选择流
        InputStream is = null;
        try {
             is = new FileInputStream(src);
            //3.操作
            byte[] data = new byte[1024];//缓冲容器
            int len =-1;
            while((len=is.read(data))!=-1){
                //字节数组--->字符串（解码）
                String str = new String(data,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.释放资源
            try {
                if(null != is){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    }

    private static void DemoInputStream01() {
        //1.创建源
        File src = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest.txt");
        //2.选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //3.操作
            int data ;
            while((data=is.read())!=-1){
                System.out.print( (char)data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
            try {
                if(null != is){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
