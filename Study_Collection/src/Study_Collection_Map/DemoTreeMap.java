package Study_Collection_Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(2, "b");
		map.put(3, "c");
		map.put(1, "a");
		map.put(4, "d");
		map.put(6, "f");
		map.put(5, "e");
		System.out.println(map);
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it =keys.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			String value = map.get(i);
			System.out.println(value);
		}
	}

}
