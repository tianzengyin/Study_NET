package study_Collection01;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 * Collection
 *   |--List : Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
 *       |--ArrayList:�ײ�����ݽṹʹ�õ�������ṹ.�ص�:��ѯ�ٶȿ�,��ɾ�ٶ���.�̲߳�ͬ��
 *       |--LinkedList:�ײ�ʹ�õ��������ݽṹ,�ص�:��ɾ�ٶȿ�,��ѯ����.
 *       |--Vector:�ײ����������ݽṹ.�߳�ͬ��.��ArrayList�����.
 *   |--Set : Ԫ��������ģ�Ԫ�ز������ظ���
 *   
 * List:
 *     ���з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ���
 *     ����
 *        boolean add(E e)  ;
 *        void    add(int index, E element)  ;
 *        boolean addAll(Collection<? extends E> c)  ;
 *        boolean addAll(int index, Collection<? extends E> c) 
 *     ɾ��
 *        E       remove(int index);
 *        boolean remove(Object o) ;
 *        boolean removeAll(Collection<?> c) 
 *     �ģ�
 *     	  set(index,element);
 *     �飺
 *        get(index) ;
 *        subList(from,to);
 *        listIterator();
 * 
 * */
public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		//���Ԫ��
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
		//��ָ��λ�����Ԫ��
		/*a1.add(1, "java09");
		
		sop(a1);
		
		//ɾ��ָ����λ�õ�Ԫ��
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
