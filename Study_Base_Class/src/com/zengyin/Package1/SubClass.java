package com.zengyin.Package1;

class BaseClass{
	private int book = 6;
	public void base(){
		System.out.println("父类的普通方法");
	}
	public void test(){
		System.out.println("父类被覆盖的方法");
	}
}
public class SubClass extends BaseClass {
    
	public String book ="java讲义";
	public void test(){
		System.out.println("子类覆盖父类的方法");
	}
	public void sub(){
		System.out.println("子类的普通方法");
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
