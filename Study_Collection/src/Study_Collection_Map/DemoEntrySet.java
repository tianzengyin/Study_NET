package Study_Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合遍历的第二种方式,使用Entry对象遍历
 * 	1.使用map 集合中的entrySet(),把集合中的多个Entry对象取出来,
 *    存储的一个Set集合中
 * 	2.遍历Set集合,获取每一个Entry对象
 *  3.使用Entry对象中的方法获取键与值
 * */
public class DemoEntrySet {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("赵丽颖", 168);
		map.put("杨幂", 165);
		map.put("林志玲", 178);
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		/*Iterator<Map.Entry<String,Integer>> it =set.iterator();
		while(it.hasNext()){
			Map.Entry<String,Integer> entry = it.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"..."+value);
		}*/
		for(Map.Entry<String, Integer> entry : set ){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"..."+value);
			
		}
	}

}
