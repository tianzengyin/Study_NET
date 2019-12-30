package Study_Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map���ϱ����ĵڶ��ַ�ʽ,ʹ��Entry�������
 * 	1.ʹ��map �����е�entrySet(),�Ѽ����еĶ��Entry����ȡ����,
 *    �洢��һ��Set������
 * 	2.����Set����,��ȡÿһ��Entry����
 *  3.ʹ��Entry�����еķ�����ȡ����ֵ
 * */
public class DemoEntrySet {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("����ӱ", 168);
		map.put("����", 165);
		map.put("��־��", 178);
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
