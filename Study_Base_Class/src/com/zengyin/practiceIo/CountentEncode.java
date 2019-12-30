package com.zengyin.practiceIo;

import java.io.UnsupportedEncodingException;

/**
 * 编码:字符串--->字节,utf-8一个中文字符占三个字节,英文占一个字节
 *                 unicode一个中文字符占两个字符
 * 
 * 
 * **/
public class CountentEncode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "性命生命使命a";
		//编码:字节数组
		byte[] datas = msg.getBytes();
		System.out.println(datas.length);
		//编码:其他字符集
		 datas = msg.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		datas = msg.getBytes("GBK");
		System.out.println(datas.length);
	}

}
