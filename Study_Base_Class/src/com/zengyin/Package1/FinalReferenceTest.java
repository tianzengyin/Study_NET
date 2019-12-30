package com.zengyin.Package1;

import java.util.Arrays;

public class FinalReferenceTest {

	public static void main(String[] args) {
		final int[] iArr = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		//iArr = {45,453,12};
		final Teacher t = new Teacher(45);
		t.setAge(12);
		System.out.println(t.getAge());
		//t =null;
	}

}
class Teacher{
	 private int age;
	 public Teacher(){}
	 public Teacher(int age){
		 this.age = age;
	 }
	 public void setAge(int age){
		 this.age = age;
	 }
	 public int getAge(){
		 return this.age;
	 }
	 
	
}