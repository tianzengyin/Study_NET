package com.zengyin.practice201901;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ListErr {

	public static void main(String[] args) {
    
		//创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<>();
		strList.add("天津");
		strList.add("河北");
		strList.add("北京");
		strList.add("5");
		strList.forEach(str -> System.out.println((str).length()));
		List<String> books = new ArrayList<>();
		books.add("津南");
		books.add("河西");
		books.add("河东");
		books.forEach(ele -> System.out.println(ele.length()));
		Map<String , List<String>>	schoolsInfo = new HashMap<>();
		List<String> schools = new ArrayList<>();
		schools.add("血月三星洞");
		schools.add("西天取经路");
		schoolsInfo.put("孙悟空",schools);
		schoolsInfo.forEach((key , value) -> System.out.println(key + "-->" + value));

}
}

/*class Apple1<T>{
	private T info;
	public Apple1(){}
	public Apple1(T info){
		this.info = info;
		}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
}*/

