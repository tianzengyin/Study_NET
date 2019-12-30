package com.zengyin.Package1;

public class Person {

	private String name;
	private int age;
	
	public void setName(String name){
		if(name.length() > 6 || name.length() < 2){
		 System.out.println("�����õ�����������Ҫ��");
		}
		else{
			 this.name = name;
		}
	}
	
	public String getName(){
		return this.name = name;
	}
	
	public void setAge(int age){
		if(age > 100 || age < 0){
			 System.out.println("����������䲻����Ҫ�󣡣���");
		}else{
			this.age = age ;
		}
	}
	
	public int getAge(){
		
		return this.age = age;
	}
	
	public Person(){
		
	}
	
	public Person(String name , int age){
		this.name = name;
		this.age = age;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
        p1.setName("join");
        System.out.println(p1.getName());
        p1.setAge(20);
        System.out.println(p1.getAge());
        
        Person p2 = new Person("����",23);
        System.out.println(p2.getName()+p2.getAge());
        
        Apple a1 = new Apple("����","����","��ɫ",35);
        //a1.setPlaceOfProduction("����");
        a1.info();
        
        System.out.println(a1.getPlaceOfProduction()+a1.getClass());
        
        
        
	}

}

class Apple extends Fruit{
	private String name;
	private String color;
	private double weight;
	
	public Apple(){}
	public Apple(String name, String color){
		this.name = name;
		this.color = color;
	}
	public Apple(String name , String color ,double weight){
		this(name,color);
		this.weight = weight;
	}
	public Apple(String placeOfProduction , String name , String color ,double weight){
		super(placeOfProduction);
		//this(name, color,weight);
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	/**��д����info����*/
	public void info(){
		super.info();
		System.out.println("����һֻˮ��,��:"+this.name+",��ɫ��:"+this.color+",��:"+this.weight+"g");
	}
}
class Fruit{
	private String placeOfProduction;
	public Fruit(){}
	/** ��������*/
	{
		
	}
	public Fruit(String placeOfProduction){  /* �вι��� */
		this.placeOfProduction = placeOfProduction;
	}
	
    public void setPlaceOfProduction(String placeOfProduction){
    	this.placeOfProduction = placeOfProduction;
    }
    public String getPlaceOfProduction(){
    	return this.placeOfProduction = placeOfProduction;
    	
    }
	public void info(){
		System.out.println("����һ��ˮ��!����"+this.getPlaceOfProduction());
	}
}

class Bird{
	public void fly(){
		System.out.println("����������ɵķ���");
	}
}

class Ostrich extends Bird{
	public void fly(){
		System.out.println("��ֻ���ڲݵ�����");
	}
	
}
