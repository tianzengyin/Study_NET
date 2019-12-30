package Study_Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap();
		h.put(2, "bbb");
		h.put(6, "fff");
		h.put(1, "aaa");
		h.put(5, "eee");
		h.put(8, "hhh");
		h.put(3, "ccc");
		h.put(4, "ddd");
		h.put(7, "ggg");
		
		Set<Map.Entry<Integer,String>> entrys = h.entrySet();
		Iterator<Map.Entry<Integer,String>>  it = entrys.iterator();
		while(it.hasNext()){
			Map.Entry<Integer,String> entry = it.next();//entry key value
			Integer key =entry.getKey();
			String value = entry.getValue();
			sop(key+"--"+value);
		}
		//sop(h);
		//获取Map集合的全部key
		//sop(h.getOrDefault(10, "rrr"));
		//sop(h.getOrDefault(8, "rrr"));
		//h.putIfAbsent(2,"124");
		//sop(h);
		/*Set<Integer> keys = h.keySet();
		//通过迭代器遍历所有keys
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			String value = h.get(key);
			sop(key);
			sop(value);
		}*/
		/*for(int i = 0 ;i<h.size();i++){
			String a = h.get(i);
			System.out.println(a);
		}*/
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
