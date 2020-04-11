package com.itcast.demo;

/**
 *
 * @作者 itcast
 * @创建日期 2020/3/23 9:36
 **/
public class Thread05_priority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "线程一");
        t1.start();
        Thread t2 = new Thread(new MyRunnable(), "线程二");
        t2.start();
        Thread t3 = new Thread(new MyRunnable(), "线程三");
        t3.start();
    }
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            // 当前线程的名称
            String threadName = Thread.currentThread().getName();
            for (int i = 0; i < 10; i++) {
                System.out.println("当前线程:"+threadName+"---"+i);
            }
        }
    }
}
