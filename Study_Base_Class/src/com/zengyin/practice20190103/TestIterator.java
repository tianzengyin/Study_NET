package com.zengyin.practice20190103;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

public class TestIterator {

	public static void main(String[] args) {
		Collection  c = new ArrayList();
		c.add("�����");
		c.add(6);
		c.remove(6);
		c.add("������java��ҵӦ��ʵս");
		Collection books = new HashSet();
		books.add("������java��ҵӦ��ʵս");
		books.add("���java����");
		System.out.println(c);
		System.out.println(books);
		//books.forEach(obj -> System.out.println("��������Ԫ��:" + obj));
		Iterator it = books.iterator();
		/*while(it.hasNext()){
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("���java����")){
				it.remove();
			}
			book = "�����ַ���";
		}*/
		it.forEachRemaining(obj -> System.out.println("��������Ԫ��"+obj));
		System.out.println(books);
		books.add("���iOS����");
		books.add("���AJAX����");
		//books.removeIf(ele -> ((String)ele).length()<10);
		System.out.println(books);
		System.out.println(calAll(books , ele ->((String)ele).contains("���")));
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
