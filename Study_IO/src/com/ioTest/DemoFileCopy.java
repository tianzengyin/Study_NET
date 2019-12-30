package com.ioTest;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/26
 * @Description: 文件拷贝：文件字节输入、输出流
 * @VERSION:1.0
 */
public class DemoFileCopy {
    public static void main(String[] args){
//        System.out.println(System.getProperty("user.dir"));
//        FileCopy();


    }

    private static void FileCopy() {
        //1.创建源
        File src = new File(".\\Study_IO\\file\\dest.txt");//源头
        File dest = new File(".\\Study_IO\\file\\abc.txt");//目的地

        InputStream is = null;
        OutputStream os = null;
        //2.选择流
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            //3.操作,分段读取
            byte[] flush = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while((len=is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            //4.释放资源先打开的后关闭
            try {
                if(null!=os){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
