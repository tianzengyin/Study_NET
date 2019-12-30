package study_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * ��������ʹ�ò���:
 * 		1.ʹ�ü����еķ���iterator()��ȡ��������ʵ�������,ʹ��Iterator�ӿڽ���(��̬)
 * 		2.ʹ��Iterator�ӿ��з���hasNext()�жϻ���û����һ��Ԫ��\
 * 		3.ʹ��Iterator�ӿ��з���Next()ȡ�������е���һ��Ԫ��
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
