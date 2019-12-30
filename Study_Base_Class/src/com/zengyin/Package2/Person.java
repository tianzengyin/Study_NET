package com.zengyin.Package2;

class Name{
	private String firstName;
	private String lastName;
	public Name(){}
	public Name(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Name类构造执行完成");
	}
	public void  setFirstName(String firstName){
		this.firstName = firstName;
		System.out.println("firstName参数设置完毕");
	}
	public String getFirstName(){
		System.out.println("拿到firstName参数");
		return this.firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
		System.out.println("lastName参数设置完毕");
	}
	public String getLastName(){
		System.out.println("拿到lastName参数");
		return this.lastName;
	}
}
public class Person {
	private final Name name;
	public Person(Name name){
		
		this.name = new Name(name.getFirstName() , name.getLastName());
		System.out.println("Person类的构造方法执行完成,创建一个新的对象");
	}
	public Name getName(){
		System.out.println("用getName方法创造了一个匿名Name对象");
		//return name;
		return  new Name(name.getFirstName() , name.getLastName());
	}
	public static void main(String[] args) {
		Name n = new Name("悟空" , "孙");
		Person p = new Person(n);
		n.setFirstName("八戒");
		System.out.println(p);
		System.out.println(p.getName().getFirstName());
		/*System.out.println(p.getName().getFirstName());*/
	}

}
