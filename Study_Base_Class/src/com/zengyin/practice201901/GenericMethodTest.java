package com.zengyin.practice201901;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethodTest {

	public static void main(String[] args) {
		/*String[] strArr = {"a","bb"};
		List<String> strList = new ArrayList<>();
		//Collection<String>对象不能当成Collection<Object>使用
		//fromArrayToCollection(strArr,strList);
		
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		fromArrayToCollection(oa,co);
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		fromArrayToCollection(sa, cs);
		fromArrayToCollection(sa, co);
		
		Integer[] ia = new Integer[100];
		Float[] fa = new Float[100];
		Number[] na = new Number[100];
		Collection<Number> cn = new ArrayList<>();
		fromArrayToCollection(ia,cn);
		fromArrayToCollection(fa,cn);
		fromArrayToCollection(na,cn);
		fromArrayToCollection(na,co);*/
		
		List<String> strList1 = new ArrayList<>();
		
		strList1.add("天津");
		strList1.add("河北");
		strList1.add("北京");
		
		List<String> strList2 = new ArrayList<>();
		strList2.add("沧州");
		//strList2.addAll(strList1);
		test(strList1,strList2);
		System.out.println(strList2.toString());
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList<>();
		test(as,ao);
		
		
	}
   //将一个数组里的所有元素添加到一个集合里
	static <T> void fromArrayToCollection(T[] a, Collection<T> c){
		for( T o : a  ){
			c.add(o);
		}
	}
	
	static <T> void test(Collection<? extends T> from , Collection<T> to) {
		for(T ele:from){
			to.add(ele);
		}
	}
}
