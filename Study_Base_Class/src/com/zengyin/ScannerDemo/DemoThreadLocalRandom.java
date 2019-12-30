package com.zengyin.ScannerDemo;

//import java.util.concurrent.ThreadLocalRandom;

public class DemoThreadLocalRandom {

	public static void main(String[] args) {
		//ThreadLocalRandom th = ThreadLocalRandom.current();
		//int a = th.nextInt(4 , 20);
		/*for(int i = 0;i<5 ;i++){
			System.out.println(th.nextInt(4 , 20));	*/
		long start = System.currentTimeMillis();
		for(int i = 0; i<1000;i++){
			System.out.println("*");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		}
		
	}


