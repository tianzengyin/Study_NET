package study_Collection01;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 * Collection
 *   |--List : 元素是有序的，元素可以重复，因为该集合体系有索引。
 *       |--ArrayList:底层的数据结构使用的是数组结构.特点:查询速度快,增删速度慢.线程不同步
 *       |--LinkedList:底层使用的链表数据结构,特点:增删速度快,查询稍慢.
 *       |--Vector:底层是数组数据结构.线程同步.被ArrayList替代了.
 *   |--Set : 元素是无序的，元素不可以重复。
 *   
 * List:
 *     特有方法，凡是可以操作角标的方法都是改体系特有的方法
 *     增：
 *        boolean add(E e)  ;
 *        void    add(int index, E element)  ;
 *        boolean addAll(Collection<? extends E> c)  ;
 *        boolean addAll(int index, Collection<? extends E> c) 
 *     删：
 *        E       remove(int index);
 *        boolean remove(Object o) ;
 *        boolean removeAll(Collection<?> c) 
 *     改：
 *     	  set(index,element);
 *     查：
 *        get(index) ;
 *        subList(from,to);
 *        listIterator();
 * 
 * */
public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		//添加元素
		a2.add("java04");
		a2.add("java05");
		a2.add("java06");
		
		a1.add("java01");
		a1.add("java02");
		a1.add("java03");
		a1.addAll(a2);
		//sop(a1);
		
		ListIterator li = a1.listIterator();
		
		sop(li.hasPrevious());
		while(li.hasNext()){
			Object obj = li.next();
			
			if(obj.equals("java02")){
				//li.add("java002");
				li.set("java08");
				
			}
			//sop(a1);
		}
		//sop(a1);
		while(li.hasPrevious()){
			Object obj = li.previous();
			sop(obj);
		}
		/*sop(li.hasPrevious());
		sop(a1);*/
		
		/*Iterator lt = a1.iterator();
		while(lt.hasNext()){
			Object obj = lt.next();
			if(obj.equals("java02")){
				
				//a1.add("java008");
				lt.remove();
				sop(obj);
			}
		//sop(a1);
		}*/
		
		
		/*int a = a1.indexOf("java02");
		sop(a);
		
		String s = a1.get(2);
		sop(s);*/
		//在指定位置添加元素
		/*a1.add(1, "java09");
		
		sop(a1);
		
		//删除指定的位置的元素
		a1.remove(1);
		sop(a1);*/
		
		
	}

	public static void test1() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		TreeSet ts = new TreeSet();
		for(int i = 0 ;i<10000;i++){
			arrayList.add(0,"a");
		}
		long time1 = System.currentTimeMillis();
		for(String str:arrayList){
			
		}
		long time2 = System.currentTimeMillis();
		System.out.println(""+(time2-time1));
	}
    public static void sop(Object obj){
    	System.out.println(obj);
    }
}
