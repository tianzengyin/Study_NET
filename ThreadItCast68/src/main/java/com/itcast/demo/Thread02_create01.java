package com.itcast.demo;

/**
 * 使用继承Thread 方式创建线程池
 * @作者 itcast
 * @创建日期 2020/3/18 15:31
 **/
public class Thread02_create01 {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread myThread = new MyThread();
        // 启动线程
        myThread.start();
    }
    // 继承Thread类  实现run方法
    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("输出打印"+i);
            }
        }
    }
}
