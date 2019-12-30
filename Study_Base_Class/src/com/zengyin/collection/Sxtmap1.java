package com.zengyin.collection;
/**
 * 自定义实现Map的功能
 * Map:存放键值对,根据键对象找对应的值对象,键不能重复
 */
public class Sxtmap1 {
	SxtEntry[] arr = new SxtEntry[990];
	private int size;
	public int size(){
		return size;
	}
	public void put(Object key, Object value){
		SxtEntry e = new SxtEntry(key,value);
		//解决键值重复的问题
		for(int i = 0;i<size;i++){
			if(arr[i].key.equals(key) )
				 arr[i].value = value;
			return;
		}
		arr[size++] = e;
	}
	
	public Object get(Object key){
		for(int i = 0;i<size;i++){
			if(arr[i].key.equals(key) )
				return arr[i].value;
		}
		return null;
	}
	public void remove(Object key){
		
		for(int i = 0; i < size; i++){
			if(arr[i].key.equals(key) )
				System.arraycopy(arr, i+1, arr, i,
                        size-i);break;
		}
		arr[--size] = null;
	}
	public boolean containskey(Object key){
		if(size > 0){
		for(int i = 0; i < size; i++){
			if(arr[i].key.equals(key) )
				return true;
		}
		}
		return false;
	}
	public boolean containsValue(Object value){
		if(size > 0){
		for(int i = 0; i < size; i++){
			if(arr[i].value.equals(value) )
				return true;
		}
	}
		return false;
	}
	/*public void putAll(Map t){
		
	}*/
	public static void main(String[] args) {
		Sxtmap1  m = new Sxtmap1();
		m.put("aaa", "bbb");
		m.put("cccc", "dddd");
		m.put("eeee", "ffff");
		m.put("eeee", "wwww");
		/*String s1 = (String)m.get("aaa");
		String s2 = (String) m.get("cccc");
		System.out.println(s1);
		System.out.println(s2);*/
		//m.remove("aaa");
		/*String s1 = (String)m.get("aaa");
		System.out.println(s1);
		String s2 = (String) m.get("cccc");
		System.out.println(s2);*/
		/*for(int i = 0;i<m.size();i++){
			System.out.println(arr[i]);
		}*/
		//boolean b = m.containskey("aaa");
		//boolean b1 = m.containsValue("bbb");
		String s3 = (String)m.get("eeee");
		System.out.println(s3);
		
		
	}

}
class SxtEntry{
	Object key;
	Object value;
	public SxtEntry(Object key, Object value){
		super();
		this.key = key;
		this.value = value;
	}
	
}