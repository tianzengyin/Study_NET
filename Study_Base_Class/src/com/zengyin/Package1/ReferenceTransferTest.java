package com.zengyin.Package1;

class DataDrap{
	int a;
	int b;
}

public class ReferenceTransferTest {
	public static void swap(DataDrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp ;
		System.out.println("a��Ա������ֵ��"+dw.a+";b��Ա������ֵ��"+dw.b);
		dw = null;
		//System.out.println("a��Ա������ֵ��"+dw.a+";b��Ա������ֵ��"+dw.b);
	}
	public static void test(int a , String[] books , int... s){
		for(String tem : books){
			System.out.println(tem);
		}
		System.out.println(a);
		for(int in : s){
			System.out.println(in);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataDrap dw = new DataDrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("���Q�Y����a�ɆT׃����ֵ��"+dw.a+";b�ɆT׃����ֵ��"+dw.b);
		
		test(5 ,new String[]{"���java����" , "java���˼��" , "linux����ѧϰ"}, 12,13);
 }
}
