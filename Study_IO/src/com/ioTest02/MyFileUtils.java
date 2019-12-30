package com.ioTest02;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/28
 * @Description: 1.封装拷贝
 *                2.封装释放
 * @VERSION:1.0
 */
public class MyFileUtils {
    public static void main(String[] args){
        //文件到文件
        /*try {
            InputStream is = new FileInputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest.txt");
            OutputStream os = new FileOutputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest_copy.txt");
            copy01(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }*/
        //文件到字节数组
        byte[] bytes =null;
        try {
            InputStream is = new FileInputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\meitu.jpg");
            ByteArrayOutputStream os  =new ByteArrayOutputStream();
            copy01(is,os);
            bytes = os.toByteArray();
            System.out.println("bytes = " + bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(bytes);
            OutputStream os =new FileOutputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\meitu03.jpg");
            copy01(is,os);
            System.out.println(new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\meitu03.jpg").length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void copy(String srcPath, String destPath) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(new File(srcPath));
            os = new FileOutputStream(new File(destPath));
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(is,os);
        }

    }

    /**
     * 对接输入输出流
     * try ...with..resource
     * @param is
     * @param os
     */
    public static void copy01(InputStream is, OutputStream os) {

        try {
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(is,os);
        }
    }

    /**
     * 释放资源
     * @param is
     * @param os
     */
    public static void close(InputStream is, OutputStream os){
        try {
            if (null != os) {
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

    /**
     * 释放资源
     * @param io
     */
    public static void close(Closeable ... io){
        for (Closeable closeable : io) {
            try {
                if (null != closeable) {
                    closeable.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 自动释放资源
     * @param srcPath
     * @param destPath
     */
    public static void copy02(String srcPath, String destPath) {
        //1.创建源
        //2.选择流
        try(InputStream is = new FileInputStream(new File(srcPath));
            OutputStream os =new FileOutputStream(new File(destPath))){
            //3.操作
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } /*finally {
            close(is,os);
        }*/

    }
}
