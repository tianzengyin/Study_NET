package com.zengyin.Package1;


public class MathTest {

	public static void main(String[] args) {
		//将弧度转换成角度
		System.out.println("Math.toDegrees(1.57): " + Math.toDegrees(1.57));
		//将角度转换成弧度
		System.out.println("Math.toRadians(90): " + Math.toDegrees(90));
		//计算反余弦,返回的角度范围在0.0到pi之间,参数在-1到1之间
		System.out.println("Math.acos(1):" + Math.acos(1));
		//计算反正弦,返回的角度范围在-pi/2 到 pi/2 之间
		System.out.println("Math.asin(0.8):" + Math.asin(0.8));
		//计算反正切,返回的角度范围在-pi/2 到 pi/2 之间
		System.out.println("Math.atan: " + Math.atan(2.3));
		//计算三角余弦
		System.out.println("Math.cos(1.57):" + Math.cos(1.57));
		//计算双曲余弦
		System.out.println("Math.cosh(1.2):" + Math.cosh(1.2));
		//计算正弦
		System.out.println("Math.sin(1.57):" + Math.sin(1.57));
		
		/*---------下面是取正运算-----------*/
		System.out.println("Math.floor(-1.2)" + Math.floor(-1.2));
		System.out.println("Math.ceil(-1.2)" + Math.ceil(-1.2));
		System.out.println("Math.floor(2.6)" + Math.floor(2.6));
		System.out.println("Math.ceil(2.6)" + Math.ceil(2.6));
		/*----------下面是乘方,开方,指数运算------------------------*/
		//计算平方根
		System.out.println("Math.sqrt(4):" + Math.sqrt(4));
		//计算立方根
		System.out.println("Math.cbrt(9)" + Math.cbrt(9.0));
		System.out.println(Math.random());
		
	}

}
