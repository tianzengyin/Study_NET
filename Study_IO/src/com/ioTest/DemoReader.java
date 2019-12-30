package com.ioTest;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/27
 * @Description: 字符输入流
 * @VERSION:1.0
 */
public class DemoReader {
    public static void main(String[] args){
        //1.创建源
        File src = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest.txt");
        //2.选择流
        Reader reader = null;
        try {
            reader = new FileReader(src);
            //3.操作
            char[] data = new char[1024];//缓冲容器
            int len =-1;
            while((len=reader.read(data))!=-1){
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
                if(null != reader){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
