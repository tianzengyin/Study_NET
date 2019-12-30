package com.zengyin.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        /*for( int i = 0;i<list.size();i++){
        	System.out.println(list.get(i));
        }*/
        Set set = new HashSet();
        set.add("eee");
        set.add("fff");
        set.add("ddd");
        
        Iterator iter = set.iterator();//初始化
        while(iter.hasNext()){  //判断
        	String  str = (String)iter.next();
        	System.out.println(str);
        }
        
        //Iterator iter2 = list.iterator();//初始化
         for(Iterator iter2 = list.iterator();iter2.hasNext();){
        	 String str = (String)iter2.next();
        	 System.out.println(str);
         }
        
	}

}
