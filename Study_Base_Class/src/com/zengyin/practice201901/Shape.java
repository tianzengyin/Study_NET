package com.zengyin.practice201901;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * �趨����ͨ���������
 * */
public abstract class Shape {
	public abstract void draw(Canvas c);
	public static void main(String[] args){
		List<Circle> circleList = new ArrayList<>();
		Canvas c = new Canvas();
		circleList.add(new Circle());
		
	}
}

class Circle extends Shape{
	public void draw(Canvas c){
		System.out.println("�ڻ���"+ c + "�ϻ�һ��Բ");
	}
}

class Rectangle extends Shape{
	public void draw(Canvas c){
		System.out.println("��һ�����λ��ڻ���"+ c + "��");
	}
}

class Canvas {
	public void drawAll(List<?> shapes){
		for(Object s : shapes){
			((Shape) s).draw(this);
		}
	}
}

