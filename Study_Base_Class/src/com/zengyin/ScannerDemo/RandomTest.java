package com.zengyin.ScannerDemo;

import java.util.Arrays;
import java.util.Random;



public class RandomTest {
	
	public static void main(String[] args){
		Random ra = new Random();
		boolean a = ra.nextBoolean();
		System.out.println(a);
		byte[] buffer = new byte[16];
		ra.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		System.out.println(ra.nextDouble());//返回double值,在0.0-1.0之间
		System.out.println(ra.nextFloat());//返回float值,在0.0-1.0之间
		System.out.println(ra.nextGaussian());
		System.out.println(ra.nextInt());
		System.out.println(ra.nextInt(26));
		System.out.println(ra.nextLong());
	}
}