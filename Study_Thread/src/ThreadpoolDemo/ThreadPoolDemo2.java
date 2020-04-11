package ThreadpoolDemo;

import java.util.concurrent.*;

/**
 * @Author: 田增印
 * @Date: 2020/4/11
 * @Time: 10:53
 * @Description: ThreadPoolDemo
 * @VERSION: 1.0
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args){
        //Executor executor;
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(10, 5, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10), new ThreadPoolExecutor.DiscardPolicy());

        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}
