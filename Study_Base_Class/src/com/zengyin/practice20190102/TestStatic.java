package com.zengyin.practice20190102;

public class TestStatic {

	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main()");  //10
		new Cupbuard();
		System.out.println("Creating new Cupboard() in main()");//14
		new Cupbuard();
		System.out.println("-------------");
		table.f2(1);
		cupbuard.f3(1);
	}
	
	static Table table = new Table();
	static Cupbuard cupbuard = new Cupbuard();

}

class Bowl{
	Bowl(int marker){
		System.out.println("Bowl("+marker+")");//1   2  5  6  7  11  15
	}
	void f1(int marker){
		System.out.println("f1("+marker+")");//4  9  13  17
	}
}

class Table{
	static  Bowl bowl1 =new Bowl(1);
	Bowl bow = new Bowl(1);
	Table(){
		System.out.println("Table");//3
		bowl2.f1(1);
	}
	void f2(int marker){
		System.out.println("f2("+marker+")");  //18
	}
	static Bowl bowl2 = new Bowl(2);
}

class Cupbuard{
	Bowl bowl3= new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupbuard(){
		System.out.println("Cupbuard");//8  12  16
		bowl4.f1(2);
	}
	void f3(int marker){
		System.out.println("f3("+marker+")");//19
	}
	static Bowl bowl5 = new Bowl(5);
}

//œ‘ ææ≤Ã¨≥ı ºªØ
class Spoon{
	
	static int i ;
	static{
		i = 47;
	}
	
}
