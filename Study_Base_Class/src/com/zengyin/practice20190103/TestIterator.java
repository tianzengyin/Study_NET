package com.zengyin.practice20190103;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

public class TestIterator {

	public static void main(String[] args) {
		Collection  c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		c.remove(6);
		c.add("轻量级java企业应用实战");
		Collection books = new HashSet();
		books.add("轻量级java企业应用实战");
		books.add("疯狂java讲义");
		System.out.println(c);
		System.out.println(books);
		//books.forEach(obj -> System.out.println("迭代集合元素:" + obj));
		Iterator it = books.iterator();
		/*while(it.hasNext()){
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("疯狂java讲义")){
				it.remove();
			}
			book = "测试字符串";
		}*/
		it.forEachRemaining(obj -> System.out.println("迭代集合元素"+obj));
		System.out.println(books);
		books.add("疯狂iOS讲义");
		books.add("疯狂AJAX讲义");
		//books.removeIf(ele -> ((String)ele).length()<10);
		System.out.println(books);
		System.out.println(calAll(books , ele ->((String)ele).contains("疯狂")));
		System.out.println(calAll(books , ele ->((String)ele).contains("java")));
		System.out.println(calAll(books , ele ->((String)ele).length() > 10));
	}
	
	public static int calAll(Collection books , Predicate P){
		int total = 0;
		for(Object obj : books){
			if(P.test(obj)){
				total++;
			}
		}
		
		return total;
	}

}
