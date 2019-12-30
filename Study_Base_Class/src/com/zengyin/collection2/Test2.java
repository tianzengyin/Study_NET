package com.zengyin.collection2;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map map =new HashMap();
		map.put("id", 0301);
		map.put("name","高琪");
		map.put("salary", 3050);
        map.put("department", "项目部");
        map.put("hireDate", "2007-10");
	
        Map map2 =new HashMap();
		map2.put("id", 0302);
		map2.put("name","张三");
		map2.put("salary", 3050);
        map2.put("department", "项目部");
        map2.put("hireDate", "2008-10");
        
        Map map3 =new HashMap();
		map3.put("id", 0303);
		map3.put("name","李四");
		map3.put("salary", 3550);
        map3.put("department", "项目部");
        map3.put("hireDate", "2009-10");
        
        List<Map> list = new ArrayList<Map>();
        list.add(map);
        list.add(map2);
        list.add(map3);
        printEmpName(list);
        
	}
	
	public static void printEmpName(List<Map> list){
    	for(int i = 0;i<list.size() ;i++){
    		System.out.println(list.get(i).get("name"));
    	}
    }
}
