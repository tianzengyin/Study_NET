package com.zengyin.IntegerTest;
/**
 * 基本数据类型对象包装类
 * byte    Byte
 * short   short
 * int     Integer
 * long    Long 
 * boolean Boolean
 * float   Float
 * double  Double
 * char    Character
 * 
 * 基本数据类型对象包装类的最常见作用
 * 就是用于基本数据类型和字符串之间做转换
 * 
 * 基本数据类型转成字符串
 *   
 *   : 基本数据类型+""
 *   基本数据类型.toString(基本数据类型)
 *   如:Integer.toString(34);//将35整数变成"34"
 * 
 * 字符串转成基本数据类型
 * 		xxx a = Xxx.parseXxx("12");
 *      int a = Integer.parseint("12");
 *      double d = Double.parseDouble("120.35");
 *      
 * 
 * */
public class IntegerTest01 {

	public static void main(String[] args) {
		//整数类型最大值
		//将一个字符串转成整数
		int num = Integer.parseInt("123");
		sop("num = "+(num+5));
	}
	public static void sop(String str){
		System.out.println(str);
	}

}
