package com.TCPTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Auther:田增印
 * @Date: 2019/5/23
 * @Description: com.TCPTest
 * @VERSION:1.0
 */
public class TCPTest01 {
    public static void main(String[] args){
        new TCPTest01().server();

    }
    //客户端
    public void client()  {
        Socket socket =null;
        OutputStream os =null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");

            socket = new Socket(inet,8877);

            os = socket.getOutputStream();
            os.write("你好，我是客户端".getBytes());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!= os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null!= socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //服务端
    public void server(){
        ServerSocket ss =null;
        Socket socket =null;
        InputStream is = null;
        ByteArrayOutputStream baos =null;
        try {
            ss = new ServerSocket(8899);
            socket = ss.accept();
            is = socket.getInputStream();
           /* byte[] buffer = new byte[20];
            int len = 0;
            while((len =is.read(buffer))!=-1){
                String s = new String(buffer, 0, len);
                System.out.println("s = " + s);
            }*/
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len ;
            while((len = is.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(null != baos){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(null != is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                };
            }
            if(null !=ss ){
                try {
                    ss.close();
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
        }
    }

}
