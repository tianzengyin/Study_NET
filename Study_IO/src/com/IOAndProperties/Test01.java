package com.IOAndProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Auther:田增印
 * @Date: 2019/5/4
 * @Description: IO + Properties
 *                  注意：一般在程序中可变的东西不要写死，推荐写到配置文件中。运行同样的程序可以得到不同的结果。
 *                  像dbinfo这样一个具有特殊内容的配置文件我们又叫做:属性文件
 *                  java规范中要求单属性文件以".properties"结尾
 * @VERSION:1.0
 */
public class Test01 {
    public static void main(String[] args){
        test01();
       /* File file = new File("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\IOAndProperties\\dbinfo.properties");
        try {
            //File canonicalFile = file.getCanonicalFile();
            String name = file.getCanonicalPath();
            System.out.println("name = " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    private static void test01() {
        //1.创建属性对象
        Properties p = new Properties();//和Map一样，只不过key和value 只能存储字符串类型
        // key不能重复, 如果 key 重复则value覆盖
        //2.创建输入流
        FileInputStream fis = null;
        try {
           fis  = new FileInputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\src\\com\\IOAndProperties\\dbinfo.properties");
         //3.将fis流中的所有数据加载到属性对象中
            p.load(fis);
         //4.关闭流
            fis.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
//        通过key获取value
        String v1= p.getProperty("username1");
        String v2= p.getProperty("username2");
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
    }
}
