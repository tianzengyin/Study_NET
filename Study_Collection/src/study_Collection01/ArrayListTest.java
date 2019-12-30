package study_Collection01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 将自定义对象作为元素存到ArrayList集合中,并去除重复元素
 * 
 * */
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add("java01");
		a.add("java01");
		a.add("java01");
		a.add("java02");
		a.add("java02");
		a.add("java02");
		a.add("java03");
		
		System.out.println(a);
		ArrayList a2 = singleElement(a);
		System.out.println(a2);
		
	}
	public static ArrayList singleElement(ArrayList a){
		ArrayList newa = new ArrayList();
		Iterator it  = a.iterator();
		while(it.hasNext()){//在迭代时循环中next调用一次,就要用hasNext判断一次
			Object obj = it.next();
			if(!newa.contains(obj)){
				newa.add(obj);	
			}
			
		}
		return newa;
	}
}
