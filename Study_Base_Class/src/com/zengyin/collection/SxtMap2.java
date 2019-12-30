package com.zengyin.collection;
import java.util.LinkedList;
/**
  * �Զ���ʵ��Map�Ĺ���
  * Map:��ż�ֵ��,���ݶ����Ҷ�Ӧ��ֵ����,�������ظ�
  * ��߲�ѯ��Ч��
  * */
public class SxtMap2 {

	LinkedList[] arr = new LinkedList[990];
	private int size;
	
	public  void put(Object key , Object value){
		SxtEntry e = new SxtEntry(key,value);
		   int a = key.hashCode()%arr.length;
		if(arr[a] == null){
			LinkedList list = new 	LinkedList();
			arr[a] = list;
			list.add(e);
		}else{
			LinkedList list = arr[a];
			for(int i= 0;i<list.size();i++){
				SxtEntry e2 =(SxtEntry) list.get(i);
				if(e.key.equals(key)){
					 e2.value = value;//��ֵ���ظ�ֱ�ӽӸ���
					 return;
				}
			arr[a].add(e);
		}
		
	}
	}
	public Object get(Object key){
		int a = key.hashCode()%arr.length;
		if(arr[a] != null){
			LinkedList list = arr[a];
			for(int i= 0;i<list.size();i++){
				SxtEntry e =(SxtEntry) list.get(i);
				if(e.key.equals(key)){
					return e.value;
				}
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		SxtMap2  m = new SxtMap2();
		m.put("aaa", "bbb");
		m.put("cccc", "dddd");
		m.put("eeee", "ffff");
		m.put("eeee", "wwww");
		String s3 = (String)m.get("eeee");
		System.out.println(s3);
	}

}
