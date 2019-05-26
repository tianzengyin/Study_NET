package com.TCPTest;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther:田增印
 * @Date: 2019/5/24
 * @Description: 实现TCP的网络编程
 *                  从客户端发送文件给服务端，服务端保存到本地，并返回“发送成功”给客户端。
 *                  并关闭相应的连接
 * @VERSION:1.0
 */
public class TCPTest03 {
    public static void main(String[] args){
        server();
        client();
    }
    public static void client() {
        Socket socket =null;
        OutputStream os =null;
        FileInputStream fis =null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            //1.造一个socket
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);
            //2.获取一个输出流
            os = socket.getOutputStream();
            //3.获取一个输入流
            fis = new FileInputStream(new File("D:\\ieda_workspace\\helloidea\\Study_NET\\微信图片_20190430184501.jpg"));
           //4.操作
            byte[] buffer = new byte[1024];
            int len ;
            while((len = fis.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            //关闭数据的输出
            socket.shutdownOutput();
            //5.接收来自服务器端的数据并显示到控制台上
            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] bufferr = new byte[20];
            int len2;
            while((len2 = is.read(bufferr)) != -1){
                baos.write(buffer,0,len2);
            }

            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != fis){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != is){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != baos){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void server(){
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            //1.造一个serverSocket
            ss = new ServerSocket(9090);
            //等待接收客户端的socket
            socket = ss.accept();
            //获取一个客户端的输入流
            is = socket.getInputStream();
            //创建一个输出流 把数据保存到本地
            fos = new FileOutputStream(new File("D:\\ieda_workspace\\helloidea\\Study_NET\\copy_微信图片_20190430184501.jpg"));

            byte[] buffer = new byte[1024];
            int len ;
            while((len = is.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            System.out.println("图片传输完成");
            //服务器端给予客户端反馈
            os = socket.getOutputStream();
            os.write("你好，我已收到".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != fos){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != ss){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != os){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

