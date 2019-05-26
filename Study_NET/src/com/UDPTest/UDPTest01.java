package com.UDPTest;

import java.io.IOException;
import java.net.*;

/**
 * @Auther:田增印
 * @Date: 2019/5/24
 * @Description: UDP协议的网络编程
 * @VERSION:1.0
 */
public class UDPTest01 {
    public static void main(String[] args){
        UDPTest01.receiver();
        UDPTest01.send();
    }
    //发送端
    public static void send(){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();

            String str = "UDP数据包";
            byte[] data = str.getBytes();

            InetAddress localHost = InetAddress.getLocalHost();

            DatagramPacket packet = new DatagramPacket(data,0,data.length,localHost,9090);


            socket.send(packet);

            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(null != socket){
                socket.close();
            }
        }
    }
    //接收端
    public static void receiver(){
        try {
            DatagramSocket socket = new DatagramSocket(9090);

            byte[] buffer = new byte[100];
            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

            socket.receive(packet);

            System.out.println(new String(String.valueOf(packet)));
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }

    }
}
