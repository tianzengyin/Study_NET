package com.zengyin.peactice20180110;

public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	
	public CADSystem(int i){
		super(i);
		for(int i1 =0;i1<lines.length;i1++){
			lines[i1] = new Line(i1+1,(i1+1)*(i1+1));
		}
		c= new Circle(1);
		t = new Triangle(1);
		System.out.println("Combined Constructor");
	}
	public void dispose(){
		System.out.println("CADSystem dispose");
		t.dispose();
		c.dispose();
		for(int i1 =0;i1<lines.length;i1++){
			lines[i1].dispose();
		}
	}
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try{
			System.out.println(x.toString());
		}finally{
			x.dispose();
		}
	}
	

}

class Shape{
	Shape(int i){
		System.out.println("Shape Constructor");
	}
	void dispose(){
		System.out.println("Shape dispose");
	}
	
}

class Circle extends Shape{
	Circle(int i){
		super(i);
		System.out.println("Drawing Circle");
		
	}
	void dispose(){
		System.out.println("Erasing Circle");
		//调用父类的清理工作
		super.dispose();
	}
}

class Triangle extends Shape{
	Triangle(int i){
		super(i);
		System.out.println("Drawing Triangle");
		
	}
	void dispose(){
		System.out.println("Erasing Triangle");
		//调用父类的清理工作
		super.dispose();
	}
}
class Line extends Shape{
	private  int start , end;
	Line(int start , int end){
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing Line:" + start +","+ end);
	}
	
}
