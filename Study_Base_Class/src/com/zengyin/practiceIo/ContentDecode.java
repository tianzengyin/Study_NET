package com.zengyin.practiceIo;

import java.io.UnsupportedEncodingException;

public class ContentDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "性命生命使命a";
		//编码:字节数组
		byte[] datas = msg.getBytes();
		
		//解码:其他字符集
		 msg = new String(datas,0,datas.length,"gbk");
		 System.out.println(msg);
		 //乱码:
		 //1.字节数不够
		 msg = new String(datas,0,datas.length-2,"gbk");
		 System.out.println(msg);
		 msg = new String(datas,0,datas.length-1,"gbk");
		 System.out.println(msg);
		 //2.字符集不统一
		 msg = new String(datas,0,datas.length-1,"utf-8");
		 System.out.println(msg);
		 
	}

}
