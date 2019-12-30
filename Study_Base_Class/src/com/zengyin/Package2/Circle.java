package com.zengyin.Package2;

abstract class Shape {
	{
		System.out.println("ִ��Shape�ĳ�ʼ����");
	}
	private String color;
	public abstract double calPerimeter();//�����ܳ��ĳ��󷽷�
	public abstract String getType();//������״�ĳ��󷽷�
	public Shape(){}
	public Shape(String color){
		System.out.println("ִ��Shape������");
		this.color = color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	
}

class Triangle extends Shape{

	/*@Override
	public double calPerimeter() {
		
		return 0;
	}
	*/
	private double a;
	private double b;
	private double c;
	public Triangle(String color , double a , double b , double c){
		super(color);
		this.setSides(a , b , c);
	}
	public void setSides(double a , double b ,double c){
		if(a >= b + c || b >= a + c || c >= a + b ){
			System.out.println("����������֮�ͱ�����ڵ�����");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double calPerimeter(){//��дShape��ļ����ܳ��ĳ��󷽷�
		return a+b+c;
	}
	public String getType(){ //��дShape��ķ�����״�ĳ��󷽷�
		return "������";
	}
	
}
public class Circle extends Shape{
		private double radius;
		public  Circle(String color , double radius){
			super(color);
			this.radius = radius;	
		}
		public void setRadius(double radius){
			this.radius = radius;
		}
		@Override
		public double calPerimeter() {
			
			return 2 * Math.PI * radius;
		}
		@Override
		public String getType() {
			
			return getColor() + "Բ��";
		}
		public static void main(String[] args){
			Shape s1 = new Triangle("��ɫ", 3, 4, 5);
			Shape s2 = new Circle("��ɫ" , 3 );
			System.out.println(s1.getType());
			System.out.println(s1.calPerimeter());
			System.out.println(s2.getType());
			System.out.println(s2.calPerimeter());
		}
		
}