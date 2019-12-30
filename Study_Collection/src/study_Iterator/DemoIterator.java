package study_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * 迭代器的使用步骤:
 * 		1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
 * 		2.使用Iterator接口中方法hasNext()判断还有没有下一个元素\
 * 		3.使用Iterator接口中方法Next()取出集合中的下一个元素
 * 
 * **/
public class DemoIterator {

	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
		coll.add("a");
		coll.add("b");
		coll.add("c");
		coll.add("d");
		coll.add("e");
		coll.add("f");
		Iterator<String> it = coll.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		for(String str : coll){
			System.out.println(str);
		}
	}

}
