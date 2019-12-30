package Study_Collection03_Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 练习:按照字符串长度排序
 * 
 * 字符本身具备比较性,但是它的比较方式不是所需要的
 * */
public class TreeSetTest01 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new StringLengthComparator());
		ts.add("abcd");
		ts.add("cc");
		ts.add("cba");
		ts.add("z");
		ts.add("hahaha");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}

class StringLengthComparator implements Comparator{
	public int compare(Object o1 , Object o2){
		String s1 = (String)o1;
		String s2 = (String)o2;
		if(s1.length()>s2.length()){
			return 1;
		}
		if(s1.length()==s2.length()){
			return 0;
		}
		return -1;
	}
}