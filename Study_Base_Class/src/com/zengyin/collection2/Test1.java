package com.zengyin.collection2;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
      Employee e1 = new Employee(0301,"����",3000, "��Ŀ��","2007-10");
      Employee e2 = new Employee(0302,"����",3500, "��Ŀ��","2008-10");
      Employee e3 = new Employee(0303,"����",3550, "��Ŀ��","2009-10");
      
      List<Employee> list = new ArrayList<Employee>();
      list.add(e1);
      list.add(e2);
      list.add(e3); 
      Test1.printEmpName(list);
	}
    public static void printEmpName(List<Employee> list){
    	for(int i = 0;i<list.size() ;i++){
    		System.out.println(list.get(i).getName());
    	}
    }
}
