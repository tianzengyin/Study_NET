package com.tute.test01;

/**
 * @Author:田增印
 * @Date:2019/12/30
 * @Time:10:13
 * @Description:com.tute.test01
 * @VERSION:1.0
 */
public class Main {

    public static void main(String[] args){
        test01();
    }
    @SuppressWarnings("all")
    public static void test01() {
        Hero hero = new Hero();
        hero.say();
        hero.speak();
    }
}
