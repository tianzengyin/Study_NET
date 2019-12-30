package com.zengyin.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
      public static void main(String[] args){
    	  Map map = new HashMap();
    	  map.put("123","456");
    	  String s = (String)map.get("123");
    	  System.out.println(s);
    	  //map.remove("123");
    	  //System.out.println(s);
      }
	
}
