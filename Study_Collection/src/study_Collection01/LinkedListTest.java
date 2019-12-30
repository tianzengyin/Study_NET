package study_Collection01;

import java.util.LinkedList;

/**
 * 使用LinkedList模拟一个堆栈或队列数据结构
 * 
 * 
 * */

class Duilie{
	private LinkedList link;
	Duilie(){
		link = new LinkedList();
	}
	public void myAdd(Object obj){
		link.offerLast(obj);
	}
	public Object myget(){
		return link.removeFirst();
	}
	
	public boolean isNull(){
		return link.isEmpty();
	}
	
}
public class LinkedListTest {

	public static void main(String[] args) {
		Duilie d = new Duilie();
		d.myAdd("java01");
		d.myAdd("java02");
		d.myAdd("java03");
		d.myAdd("java04");
		while(!d.isNull()){
			System.out.println(d.myget());
		}
	}

}
