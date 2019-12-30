package com.ioTest02;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/28
 * @Description: 加入缓冲流读取
 * @VERSION:1.0
 */
public class BufferedTest01 {
    public static void main(String[] args){
        //1.创建源
        File src = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\dest.txt");
        //2.选择流
        BufferedInputStream bs = null;
        try {
            bs = new BufferedInputStream( new FileInputStream(src));
            //3.操作
            int data ;
            while((data=bs.read())!=-1){
                System.out.print( (char)data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
            try {
                if(null != bs){
                    bs.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void copy(String srcPath,String destPath){
        File src = new File(srcPath);
        File dest = new File(destPath);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest));){
            String line = null;
            while((line = bufferedReader.readLine())!=null){
                bufferedWriter.write(line,0,line.length());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
