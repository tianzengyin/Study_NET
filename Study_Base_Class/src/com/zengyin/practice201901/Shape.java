package com.zengyin.practice201901;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 设定类型通配符的上限
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
		System.out.println("在画布"+ c + "上画一个圆");
	}
}

class Rectangle extends Shape{
	public void draw(Canvas c){
		System.out.println("把一个矩形画在画布"+ c + "上");
	}
}

class Canvas {
	public void drawAll(List<?> shapes){
		for(Object s : shapes){
			((Shape) s).draw(this);
		}
	}
}

