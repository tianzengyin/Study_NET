package com.zengyin.practice20180104;

public class Mugs {
    /*static*/Mug mug1;
    Mug mug2;
    {
    	mug1 = new Mug(1);
    	mug2 = new Mug(2);
    	System.out.println(" mug1 & mug2 ��ʵ����");
    }
    /*static{
    	mug1 = new Mug(1);
    }*/
    
    public Mugs(){
    	System.out.println("Mugs ���޲ι���");
    }
    public Mugs(int i){
    	System.out.println("Mugs ���вι���("+i+")");
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
		System.out.println("ִ��Mug���췽��("+marker+")");
	}
	void  f(int marker){
		System.out.println("ִ��Mug��f����("+marker+")");
	}
}