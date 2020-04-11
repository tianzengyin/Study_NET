package com.itcast.demo;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * 创建一个线程
 * 通过对任务的执行
 * 演示线程池的运行原理
 * @作者 itcast
 * @创建日期 2020/3/17 9:27
 **/
public class Thread07_pool02 {
    public static volatile boolean flag = true;
    public static void main(String[] args) {
        // 用于演示效果
        new Thread(()->{
            // 接收控制台参数
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                String s = scanner.nextLine();
                // 如果控制输入stop 将flag设置false, 所有任务都会执行完毕
                if ("stop".equals(s)){
                    flag = false;
                    break;
                }
            }
        }).start();


        // 创建线程池
        ExecutorService executor = new ThreadPoolExecutor(
                2,
                5,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());


        for (int i = 0; i < 20; i++) {
            try {
                // 循环执行 20个任务
                executor.execute(new MyRunnable("第"+(i+1)+"号任务"));
            } catch (Throwable e) {
                e.printStackTrace();
                System.out.println("丢弃任务: " + (i+1) );
            }
        }

        // 临时线程  如果获取不到新任务 会在keepAliveTime时间后 销毁
        // 核心线程默认不销毁 但如果将 allowCoreThreadTimeOut设置为true 也会在keepAliveTime时间后 销毁

        // 如果调用 executor.shutDown(); 方法会在执行完任务队列的全部任务后关闭
//        executor.shutdown();
        // 如果调用 executor.shutDownNow(); 不会在执行任务队列内的任务
//        executor.shutdownNow();
    }
    static class MyRunnable implements Runnable{
        private String name;
        public MyRunnable(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() +"==>" +name);
            while (flag){
                //flag是一个开关，为true时线程任务会一直执行让线程一直执行
            }
        }
    }
}
