package com.zengyin.ScannerDemo;

import java.math.BigInteger;

public class DemoBigInteger {

	public static void main(String[] args) {
          BigInteger bi = new BigInteger("100");
          BigInteger bi1 = new BigInteger("20");
          System.out.println(bi.andNot(bi1));
	}

}
