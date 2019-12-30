package study_Collection01;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		method_get();
	}
	public static void method_get(){
		ArrayList a1 = new ArrayList();
		a1.add("java01");
		a1.add("java02");
		a1.add("java03");
		a1.add("java04");
		
		Iterator it = a1.iterator();
		while(it.hasNext()){
			sop(it.next());
		}
		for(Iterator it1 = a1.iterator(); it1.hasNext();){
			sop(it.next());
		}
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
