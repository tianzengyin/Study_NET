package com.zengyin.ThreadTest01;
/**
 * 多线程的创建，方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 * <p>
 * 例子：遍历100以内的所有的偶数
 *
 */

/**
 * @Author:田增印
 * @Date:2019/8/14
 * @Time:20:20
 * @Description:com.zengyin.ThreadTest01
 * @VERSION:1.0
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        //System.out.println("hell0");
        for (int i = 0; i <100 ; i++) {
            if(i%2 != 0){
                System.out.println("i2 = " + i);
            }
        }
    }
}
class MyThread extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2 == 0){
                System.out.println("i1 = " + i);
            }
        }
    }
}