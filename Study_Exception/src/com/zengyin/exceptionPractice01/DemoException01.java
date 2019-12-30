package com.zengyin.exceptionPractice01;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * 异常的处理:
 * java提供了特有的语句进行处理
 * 
 * try{
 * 	   需要被检测的代码;
 * }
 * catch(异常类 变量){
 * 	处理异常的代码:(处理方式)
 * }
 * finally{
 * 	一定会执行的语句;
 * }
 * 
 * catch(Exception e){
 * System.out.println(e.getMessage);异常信息
 * System.out.println(e.toString());异常名称:异常信息
 * e.printStackTrace();//异常名称:异常信息 异常出现的位置CException
 * }
 * 
 * */
public class DemoException01 {

	public static void main(String[] args) {

	}

	

}
