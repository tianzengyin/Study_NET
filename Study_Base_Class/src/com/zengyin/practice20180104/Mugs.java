package com.zengyin.practice20180104;

public class Mugs {
    /*static*/Mug mug1;
    Mug mug2;
    {
    	mug1 = new Mug(1);
    	mug2 = new Mug(2);
    	System.out.println(" mug1 & mug2 被实例化");
    }
    /*static{
    	mug1 = new Mug(1);
    }*/
    
    public Mugs(){
    	System.out.println("Mugs 的无参构造");
    }
    public Mugs(int i){
    	System.out.println("Mugs 的有参构造("+i+")");
    }
	public static void main(String[] args) {
		System.out.println("----------");
		new Mugs();
		System.out.println("----------");
		new Mugs(1);
		System.out.println("----------");
	}

}

class Mug{
	
	Mug(int marker){
		System.out.println("执行Mug构造方法("+marker+")");
	}
	void  f(int marker){
		System.out.println("执行Mug的f方法("+marker+")");
	}
}