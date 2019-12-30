package study_Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo05 {
	/**
	 * ����ͨ���: ?
	 * 	ʹ�÷�ʽ:���ܴ�������ʹ��
	 * 			ֻ����Ϊ�����Ĳ���ʹ��
	 * */
	public static void main(String[] args) {
		
		
		//���޷���:���޷��� ? extends E ����ʹ�õķ���ֻ����E���ͱ����������
		Collection<Integer> coll1 = new ArrayList<>();
		coll1.add(1);
		coll1.add(2);
		coll1.add(3);
		getElement1(coll1);
		Collection<String> coll2 = new ArrayList<>();
		coll2.add("a");
		coll2.add("b");
		coll2.add("c");
		getElement2(coll2);
		//���޷���:���޷��� ? super E ����ʹ�õķ���ֻ����E���ͱ�����丸��
		
		
		/*ArrayList<Integer> list01 = new ArrayList<>(); 
		list01.add(1);
		list01.add(2);
		list01.add(3);
		list01.add(4);
		ArrayList<String> list02 = new ArrayList<>();
		list02.add("a");
		list02.add("b");
		list02.add("c");
		printArrayList(list01);
		printArrayList(list02);*/
		
	}
	public static void getElement2(Collection<? super String> coll){
		//String extends Object
		//ʹ�õ�������������
		Iterator<?> it =  coll.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
	}
	public static void getElement1(Collection<? extends Number> coll){
		//Integer extends Number extends Object
		//ʹ�õ�������������
				Iterator<?> it =  coll.iterator();
				while(it.hasNext()){
					Object o = it.next();
					System.out.println(o);
				}
	}
	
	public static void printArrayList(ArrayList<?> list){
		//ʹ�õ�������������
		Iterator<?> it =  list.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
		}
		
	}
}
