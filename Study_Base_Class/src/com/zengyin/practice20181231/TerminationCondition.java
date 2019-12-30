package com.zengyin.practice20181231;

public class TerminationCondition {
	public static void main(String[] args){
		Book book = new Book(true);
		book.checkIn();
		new Book(true);
		System.gc();
	}
}
class Book{
	boolean checkedOut = false;
	public Book(boolean checkedOut){
		this.checkedOut = checkedOut;
	}
	void checkIn(){
		checkedOut = false;
	}
	protected void  finalize() {
		if(checkedOut){
			System.out.println("Error: checked out");return;
			//super.finalize();
		}
		
	}
}