package com.zengyin.Package2;

abstract class Shape {
	{
		System.out.println("执行Shape的初始化块");
	}
	private String color;
	public abstract double calPerimeter();//计算周长的抽象方法
	public abstract String getType();//返回形状的抽象方法
	public Shape(){}
	public Shape(String color){
		System.out.println("执行Shape构造器");
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
			System.out.println("三角形两边之和必须大于第三边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double calPerimeter(){//重写Shape类的计算周长的抽象方法
		return a+b+c;
	}
	public String getType(){ //重写Shape类的返回形状的抽象方法
		return "三角形";
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
			
			return getColor() + "圆形";
		}
		public static void main(String[] args){
			Shape s1 = new Triangle("黑色", 3, 4, 5);
			Shape s2 = new Circle("黄色" , 3 );
			System.out.println(s1.getType());
			System.out.println(s1.calPerimeter());
			System.out.println(s2.getType());
			System.out.println(s2.calPerimeter());
		}
		
}