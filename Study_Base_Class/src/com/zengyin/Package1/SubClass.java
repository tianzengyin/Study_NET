package com.zengyin.Package1;

class BaseClass{
	private int book = 6;
	public void base(){
		System.out.println("�������ͨ����");
	}
	public void test(){
		System.out.println("���౻���ǵķ���");
	}
}
public class SubClass extends BaseClass {
    
	public String book ="java����";
	public void test(){
		System.out.println("���า�Ǹ���ķ���");
	}
	public void sub(){
		System.out.println("�������ͨ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BaseClass bc = new BaseClass();
     
     //System.out.println(bc.book);
     bc.test();
     bc.base();    
     
     SubClass sc = new SubClass();
     sc.test();
     sc.sub();
     BaseClass ploymophicBc = new SubClass();
     
     SubClass sa = (SubClass)ploymophicBc;
     System.out.println(sa.book);
     
     ploymophicBc.base();
     ploymophicBc.test();
     
	}
    
}
