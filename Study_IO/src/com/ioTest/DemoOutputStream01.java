package com.ioTest;

/**
 * @Auther:田增印
 * @Date: 2019/4/23
 * @Description: com.ioTest
 * @VERSION:1.0
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流的使用
 * */
public class DemoOutputStream01 {

    public static void main(String[] args){
        //1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = null;
            try {
                fos = new FileOutputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\123.txt");
                try {
                    //2.调用FileOutputStream对象中的方法write，把数据写入到文件中
                    fos.write(97);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                //3.释放资源
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }






}
