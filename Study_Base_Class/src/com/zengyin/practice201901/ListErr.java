package com.zengyin.practice201901;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ListErr {

	public static void main(String[] args) {
    
		//����һ��ֻ�뱣���ַ�����List����
		List<String> strList = new ArrayList<>();
		strList.add("���");
		strList.add("�ӱ�");
		strList.add("����");
		strList.add("5");
		strList.forEach(str -> System.out.println((str).length()));
		List<String> books = new ArrayList<>();
		books.add("����");
		books.add("����");
		books.add("�Ӷ�");
		books.forEach(ele -> System.out.println(ele.length()));
		Map<String , List<String>>	schoolsInfo = new HashMap<>();
		List<String> schools = new ArrayList<>();
		schools.add("Ѫ�����Ƕ�");
		schools.add("����ȡ��·");
		schoolsInfo.put("�����",schools);
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

