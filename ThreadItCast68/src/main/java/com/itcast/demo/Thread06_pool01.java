package com.itcast.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * 面对大量任务时
 * 可以使用线程池处理
 * @作者 itcast
 * @创建日期 2020/3/17 9:27
 **/
public class Thread06_pool01 {
    /**
     * 没使用线程池之前
     * 执行10000次生成随机数
     * 每次都创建一个线程去执行
     * @throws InterruptedException
     */
    @Test
    public void fun1() throws InterruptedException {
        long startTime =System.currentTimeMillis();
        final Random random = new Random();
        final List<Integer> list = new ArrayList<Integer>();
        // 需要执行10000次任务
        for (int i = 0; i < 10000; i++) {
            // 每次执行任务 创建一个线程去执行
            Thread t = new Thread(()->{
                list.add(random.nextInt(100));
            });
            t.start();
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时==>"+(endTime-startTime));
    }

    /**
     * 创建一个线程池通过固定的几个线程
     * 去执行大量的任务
     * @throws InterruptedException
     */
    @Test
    public void fun2() throws InterruptedException {
        // 创建一个线程池
        ExecutorService es = new ThreadPoolExecutor(
                8,
                8,
                20,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());

        long startTime =System.currentTimeMillis();
        final Random random = new Random();
        final List<Integer> list = new ArrayList<Integer>();
        // 让线程池  执行这10000次任务
        for (int i = 0; i < 10000; i++) {
            es.execute(()->{
                list.add(random.nextInt(100));
            });
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时==>"+(endTime-startTime));
    }


}
