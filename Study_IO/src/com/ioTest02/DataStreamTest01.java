package com.ioTest02;

import java.io.*;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: 数据流DataInputStream & DataOutputStream
 *                 1.写出后读取
 *                 2.读取的顺序与写出保持一致
 *                 DataInputStream
 *                 DataOutputStream
 * @VERSION:1.0
 */
public class DataStreamTest01 {
    public static void main(String[] args) throws IOException {
        //写出'
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
        //操作数据类型+数据
        dos.writeUTF("编码辛酸泪");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        dos.flush();
        byte[] datas =baos.toByteArray();
        //读取
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //顺序与写出一致
        String msg= dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch =dis.readChar();
        System.out.println("age = " + age);
    }
}
