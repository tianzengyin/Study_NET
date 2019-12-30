package com.ioTest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @Auther:田增印
 * @Date: 2019/4/28
 * @Description: 字节数组输入流
 * @VERSION:1.0
 */
public class DemoByteArrayInputStream {
    public static void main(String[] args)  {

        byte[] buf = new byte[0];
        try {
            buf = "Talk is cheap,show me the code".getBytes();
            InputStream byteArrayInputStream = new ByteArrayInputStream(buf);
            byte[] flush = new byte[1024];//缓冲容器
            int len =-1; //返回读取字节的长度
            while((len=byteArrayInputStream.read(flush))!=-1){
                String s = new String(flush, 0, len);
                System.out.println("s = " + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
