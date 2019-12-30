package com.zengyin.RandomTest;

import java.util.Arrays;
import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
		Random rand = new Random();
		sop(rand.nextBoolean());
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		sop(Arrays.toString(buffer));
		sop(rand.nextFloat());
		sop(rand.nextInt(15));
		sop(rand.nextInt());
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
