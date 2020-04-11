package com.itcast.demo;

/**
 * 串行和并行
 * @作者 itcast
 * @创建日期 2020/3/23 11:16
 **/
public class Thread04_demo2 {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        // 并行
        Thread t1 = new Thread(() -> {
            // 先输出10次黑马
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("黑马"+i);
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            // 才能输出10次传智
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("传智"+i);
            }
        });
        t2.start();
        t1.join();
        t2.join();
        long endTime = System.currentTimeMillis();
        System.out.println("程序执行时间==>"+(endTime-startTime));
    }

}
