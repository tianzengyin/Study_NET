package com.ioTest02;

import java.io.*;
import java.net.URL;

/**
 * @Auther:田增印
 * @Date: 2019/4/28
 * @Description: 转换流 InputStreamReader OutputStreamWriter
 *               1.以字符流的形式操作字节流（纯文本的）
 *               2.指定字符集
 * @VERSION:1.0
 */
public class ConvertTest {
    public static void main(String[] args){
       // Test01();
        //Test02();
        //Test03();
        Test04();

    }
    private static void Test04() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("http://www.tute.edu.cn").openStream(),"UTF-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\tute01.txt")))) {
            //操作读取
            String msg ;
            while((msg =reader.readLine())!=null){
                writer.write(msg,0,msg.length());
                writer.newLine();
                writer.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void Test03() {
        try(InputStreamReader inputStreamReader = new InputStreamReader(new URL("http://www.tute.edu.cn").openStream(),"UTF-8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("D:\\ieda_workspace\\helloidea\\Study_IO\\file\\tute.txt"))) {
            char[] flush = new char[1024];
            int len =-1;
            while((len=inputStreamReader.read(flush))!=-1){
                String s = new String(flush, 0, flush.length);
                outputStreamWriter.write(s,0,s.length());
            }
            outputStreamWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private static void Test02() {
        //操作网络流 和 下载百度的源代码
        try(InputStream is = new URL("http://www.tute.edu.cn").openStream();                                                                        ) {
            int temp;
            while((temp=is.read())!=-1){
                System.out.print((char)temp);
            }
        } catch (Exception e) {
            System.out.println("操作异常");
        }
    }

    private static void Test01() {
        //操作System.in 和 System.out
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer  =new BufferedWriter(new OutputStreamWriter(System.out))
                                                                                                ) {
            //循环获取键盘的输入（exit退出），输出此内容
            String msg = "";
            while(!msg.equals("exit") ){
                msg= reader.readLine();//循环读取
                writer.write(msg,0,msg.length());//循环写出
                writer.newLine();
                writer.flush();//强制刷新
            }
        } catch (Exception e) {
            System.out.println("操作异常");
        }
    }
}
