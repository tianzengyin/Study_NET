package com.zengyin.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo_Collection {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("123");
		list.add(new Date());
		list.add(4567);
		list.add(new Dog());
		System.out.println(list.size());
		//list.remove(new Date()); hashcodeºÍequals ÓÐ¹Ø
		
		List list2 = new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
		System.out.println(list.isEmpty());
		System.out.println(list2.size());
		list.add(list2);
		System.out.println(list.size());
		list.addAll(list2);
		System.out.println(list.size());
		String i1 = (String) list.get(0);
		
		Integer i2 = (Integer) list.get(2);
		System.out.println(i1);
		System.out.println(i2);
		list.set(1, "heelo");
		
		
		
	}

}
class Dog {}
