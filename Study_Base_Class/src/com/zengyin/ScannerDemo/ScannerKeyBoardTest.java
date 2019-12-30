package com.zengyin.ScannerDemo;
 import java.util.*;
public class ScannerKeyBoardTest {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// int i = sc.nextInt();//键盘录入整数存储在i中
	 System.out.println("请输入第一个整数");
	 int i = sc.nextInt();
	 System.out.println("请输入第一个字符串");
	 String s = sc.next();
	 System.out.println("i = " + i + "s = " + s);
	 
	}
}

