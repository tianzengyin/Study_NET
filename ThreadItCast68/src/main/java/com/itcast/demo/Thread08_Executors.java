package com.itcast.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Executors 线程池工具类
 * 提供了一些快捷的创建线程池的方法
 * @作者 itcast
 * @创建日期 2020/3/18 15:34
 **/
public class Thread08_Executors {
    public static void main(String[] args) {
        new Thread08_Executors().fun1();
    }
    /**
     * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
     */
    public void fun1(){
        // 创建线程池
        ExecutorService es = Executors.newCachedThreadPool();
        // 会创建出10个线程   分别执行任务
        for (int i = 0; i < 10; i++) {
            es.execute(()->{
                for (int j = 0; j < 10; j++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + j);
                }
            });
        }
        es.shutdown();
    }

    /**
     * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
     */
    public void fun2(){
        // 创建线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        // 会创建出10个线程   分别执行任务
        for (int i = 0; i < 10; i++) {
            es.execute(()->{
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName() + ":" + j);
                }
            });
        }
        es.shutdown();
    }

    /**
     * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
     */
    public void fun3(){
        // 创建线程池
        ExecutorService es = Executors.newSingleThreadExecutor();
        // 会创建出10个线程   分别执行任务
        for (int i = 0; i < 10; i++) {
            es.execute(()->{
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int j = 0; j < 10; j++) {
                    System.out.println(Thread.currentThread().getName() + ":" + j);
                }
            });
        }
        es.shutdown();
    }

    /**
     * 创建一个定长线程池，支持延迟及周期性任务执行。延迟执行示例代码如下
     */
    public void fun4(){
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);
        // 周期性执行任务（任务会执行多次）
        // 参数1：任务   参数2：延迟时间   参数3：每隔长时间   参数4：时间单位
        newScheduledThreadPool.scheduleAtFixedRate(()-> System.out.println("要执行的任务"), 3, 2, TimeUnit.SECONDS);
        // 延迟执行任务（任务执行一次）
        // 参数1：任务   参数2：延迟时间   参数3：时间单位
        newScheduledThreadPool.schedule(()->System.out.println("要执行的任务"), 3,TimeUnit.SECONDS);
    }
}
