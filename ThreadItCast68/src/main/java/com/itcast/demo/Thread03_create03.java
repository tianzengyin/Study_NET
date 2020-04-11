package com.itcast.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现Callable的接口
 * 实现一个带返回值的任务
 * @作者 itcast
 * @创建日期 2020/3/18 15:31
 **/
public class Thread03_create03 {
    public static void main(String[] args) {
        //FutureTask包装我们的任务，FutureTask可以用于获取执行结果
        FutureTask<Integer> ft = new FutureTask<>(new MyCallable());
        //创建线程执行线程任务
        Thread thread = new Thread(ft);
        thread.start();
        try {
            //得到线程的执行结果
            Integer num = ft.get();
            System.out.println("得到线程处理结果:" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    // 实现Callable接口，实现带返回值的任务
    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int num = 0;
            for (int i = 0; i < 1000; i++) {
                System.out.println("输出"+i);
                num += i;
            }
            return num;
        }
    }
}
