package com.TestIP;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther:田增印
 * @Date: 2019/5/12
 * @Description: com.TestIP
 * @VERSION:1.0
 */
public class InetAddressTest {
    public static void main(String[] args){
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.15");
            System.out.println("inet1 = " + inet1);

            InetAddress inet2 = InetAddress.getByName("www.baidu.com");
            System.out.println("inet2 = " + inet2);

            InetAddress inet3 = InetAddress.getByName("localhost");
            System.out.println("inet3 = " + inet3);

            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println("inet4 = " + inet4);
            System.out.println(inet2.getHostName());
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
