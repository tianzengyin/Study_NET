package com.zengyin.collection;
import java.util.LinkedList;
/**
  * 自定义实现Map的功能
  * Map:存放键值对,根据对象找对应的值对象,键不能重复
  * 提高查询的效率
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
					 e2.value = value;//键值对重复直接接覆盖
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
