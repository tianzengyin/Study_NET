package study_Collection01;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> stringSet = new TreeSet<String>();
		stringSet.add("b");
		stringSet.add("C");
		stringSet.add("A");
		stringSet.add("c");
		stringSet.add("a");
		stringSet.add("B");
		stringSet.add("C");
		stringSet.add("a");
		System.out.println(stringSet.size());
		sop(stringSet);
		ArrayList al = new ArrayList();
	}
    public static void sop(Object obj){
    	System.out.println(obj);
    }
}
