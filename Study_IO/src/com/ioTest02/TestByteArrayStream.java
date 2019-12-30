package com.ioTest02;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/28
 * @Description: 1.图片读取到字节数组中
 *                2.字节数组写出到文件
 * @VERSION:1.0
 */
public class TestByteArrayStream {
    public static void main(String[] args){
        byte[] datas = fileToByteArray("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\meitu.jpg");
        System.out.println("datas = " + datas.length);
        byteArrayToFile(datas,"D:\\ieda_workspace\\helloidea\\Study_IO\\file\\meitu02.jpg");
    }
    /**
     * 图片读取到字节数组
     * 1)图片到程序 FileInputStream
     * 2)程序到字节数组 ByteArrayOutputStream
     */
    public static byte[] fileToByteArray(String filePath){
        File file = new File(filePath);
        InputStream is =null;
        ByteArrayOutputStream baos= null;
        try {
            is = new FileInputStream(file);
            baos = new ByteArrayOutputStream();
            //3.操作（分段读取）
            byte[] flush = new byte[1024];//缓冲容器
            int len = -1;
            while((len = is.read(flush))!=-1){
                baos.write(flush,0,len);
            }
            baos.flush();
            return baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 字节数组写出到文件
     * 1)字节数组到程序 ByteArrayInputStream
     * 2)程序到文件 FileOutputStream
     */
    public static void byteArrayToFile(byte[] src, String filePath){
        InputStream is =null;
        OutputStream os =null;
        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(new File(filePath));
            byte[] flush = new byte[1024];
            int len = -1;
            while((len = is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
