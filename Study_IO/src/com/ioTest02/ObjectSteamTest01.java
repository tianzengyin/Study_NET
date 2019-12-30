package com.ioTest02;

import java.io.*;
import java.util.Date;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: 对象流：
 *                1.写出后读取
 *                2.读取的顺序与次而出保持一致
 *                3.不是所欲偶的对象都可以序列化，需要实现Serializable接口
 * @VERSION:1.0
 */
public class ObjectSteamTest01 {
    public static void main(String[] args)throws Exception{
        //写出'
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(baos));
        //操作数据类型+数据
        dos.writeUTF("编码辛酸泪");
        dos.writeInt(18);
        dos.writeBoolean(false);
        dos.writeChar('a');
        //对象
        dos.writeObject("谁解其中味");
        dos.writeObject(new Date());
        dos.writeObject(new Employee());

        dos.flush();
        byte[] datas =baos.toByteArray();
        //读取
        ObjectInputStream dis = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //顺序与写出一致
        String msg= dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch =dis.readChar();
        Object str = dis.readObject();
        Object date = dis.readObject();
        Object employee = dis.readObject();
        if (str instanceof String ) {
            String strObj = (String)str;
            System.out.println("strObj = " + strObj);
        }
        if (date instanceof Date ) {
            Date dateObj = (Date)date;
            System.out.println("dateObj = " + dateObj);
        }
        if (employee instanceof Employee ) {
            Employee employeeObj = (Employee)employee;
            System.out.println("employeeObj = " + employeeObj);
        }

    }
}
class Employee implements Serializable{

}
