package com.ioTest;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/27
 * @Description: com.ioTest
 * @VERSION:1.0
 */
public class DemoFileCopy02 {
    public static void main(String[] args) {
        /*File src = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\ioTest\\DemoWriter.java");
        File dest = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\DemoWriterCopy.java");
        FileCopy(src,dest);*/
        //File src = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\ioTest\\DemoWriter.java");
        /*File dest = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\DemoWriterCopy.java");
        long length = dest.length();
        System.out.println("length = " + length);*/

    }

    private static void FileCopy(File src,File dest) {
        //1.创建源
        //File src = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\ioTest\\DemoWriter.java");
       // File dest = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\DemoWriterCopy.java");
        //2.选择流
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(src);
            writer = new FileWriter(dest);
            //3.操作
            char[] chars = new char[1024];
            int len =-1;
            while((len=reader.read(chars))!=-1){
                //writer.write(chars,0,len);
                String s = new String(chars, 0, len);
                writer.write(s);
            }
            writer.flush();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            try {
                if(null != writer){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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


