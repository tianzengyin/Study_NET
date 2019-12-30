package study_Collection01;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * 
 * */
public class ArrayListTest2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("ddd");
		list.add(new Date());
		list.add(123);
		System.out.println(list.size());
	}

}
