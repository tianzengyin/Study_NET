package com.File;

import java.io.UnsupportedEncodingException;

/**
 * @Auther:田增印
 * @Date: 2019/4/23
 * @Description: com.File
 * @VERSION:1.0
 */
public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = new String("命");//性命生命使
        byte[] datas = msg.getBytes();
        //datas = msg.getBytes("UTF-16LE");
        datas = msg.getBytes("GBK");
        System.out.println(datas.length);
    }
}
