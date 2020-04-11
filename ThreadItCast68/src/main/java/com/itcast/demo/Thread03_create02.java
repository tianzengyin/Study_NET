package com.itcast.demo;

/**
 * 使用实现Runnable接口方式
 * 创建线程
 * @作者 itcast
 * @创建日期 2020/3/18 15:31
 **/
public class Thread03_create02 {
    public static void main(String[] args) {
        // 创建线程对象   传入要执行的任务
        Thread thread = new Thread(new MyRunnable());
        // 调用线程.start方法
        thread.start();
    }
    // 实现Runnable接口  实现run方法
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("输出:"+i);
            }
        }
    }
}
