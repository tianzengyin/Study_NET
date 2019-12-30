package com.ioTest;

import java.io.ByteArrayOutputStream;

/**
 * @Auther:田增印
 * @Date: 2019/4/28
 * @Description: 字节数组输出流
 * @VERSION:1.0
 */
public class DemoByteArrayOutputStream {
    public static void main(String[] args)  {

        byte[] buf = null;
        try {
            buf = "Talk is cheap,show me the code".getBytes();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(buf,0,buf.length);
            byteArrayOutputStream.flush();
            //获取数据
            buf = byteArrayOutputStream.toByteArray();
            System.out.println(buf.length+"--->"+new String(buf,0,byteArrayOutputStream.size()));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
