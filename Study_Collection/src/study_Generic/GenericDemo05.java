package study_Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo05 {
	/**
	 * 泛型通配符: ?
	 * 	使用方式:不能创建对象使用
	 * 			只能作为方法的参数使用
	 * */
	public static void main(String[] args) {
		
		
		//受限泛型:上限泛型 ? extends E 代表使用的泛型只能是E类型本身或其子类
		Collection<Integer> coll1 = new ArrayList<>();
		coll1.add(1);
		coll1.add(2);
		coll1.add(3);
		getElement1(coll1);
		Collection<String> coll2 = new ArrayList<>();
		coll2.add("a");
		coll2.add("b");
		coll2.add("c");
		getElement2(coll2);
		//受限泛型:下限泛型 ? super E 代表使用的泛型只能是E类型本身或其父类
		
		
		/*ArrayList<Integer> list01 = new ArrayList<>(); 
		list01.add(1);
		list01.add(2);
		list01.add(3);
		list01.add(4);
		ArrayList<String> list02 = new ArrayList<>();
		list02.add("a");
		list02.add("b");
		list02.add("c");
		printArrayList(list01);
		printArrayList(list02);*/
		
	}
	public static void getElement2(Collection<? super String> coll){
		//String extends Object
		//使用迭代器遍历集合
		Iterator<?> it =  coll.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
	}
	public static void getElement1(Collection<? extends Number> coll){
		//Integer extends Number extends Object
		//使用迭代器遍历集合
				Iterator<?> it =  coll.iterator();
				while(it.hasNext()){
					Object o = it.next();
					System.out.println(o);
				}
	}
	
	public static void printArrayList(ArrayList<?> list){
		//使用迭代器遍历集合
		Iterator<?> it =  list.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
		
	}
}
