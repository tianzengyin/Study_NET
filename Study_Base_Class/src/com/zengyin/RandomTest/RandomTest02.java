package com.zengyin.RandomTest;

import java.util.Random;

public class RandomTest02 {

	public static void main(String[] args) {
		//test01();
		Random rand = new Random(System.currentTimeMillis());
		sop(rand.nextInt());
		sop(rand.nextInt());
		
		
	}
	public static void test01() {
		Random r1 = new Random(50);
		sop("第一个种子为50的结果");
		sop(r1.nextBoolean());
		sop(r1.nextInt());
		sop(r1.nextInt(16));
		sop(r1.nextDouble());
		sop(r1.nextGaussian());
		sop("-----------=--");
		Random r2 = new Random(50);
		sop("第二个种子为50的结果");
		sop(r2.nextBoolean());
		sop(r2.nextInt());
		sop(r2.nextInt(16));
		sop(r2.nextDouble());
		sop(r2.nextGaussian());
		sop("-----------=--");
		Random r3 = new Random(100);
		sop("第二个种子为50的结果");
		sop(r3.nextBoolean());
		sop(r3.nextInt());
		sop(r3.nextInt(16));
		sop(r3.nextDouble());
		sop(r3.nextGaussian());
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
