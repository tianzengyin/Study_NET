package com.zengyin.Package2;

class Name{
	private String firstName;
	private String lastName;
	public Name(){}
	public Name(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Name�๹��ִ�����");
	}
	public void  setFirstName(String firstName){
		this.firstName = firstName;
		System.out.println("firstName�����������");
	}
	public String getFirstName(){
		System.out.println("�õ�firstName����");
		return this.firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
		System.out.println("lastName�����������");
	}
	public String getLastName(){
		System.out.println("�õ�lastName����");
		return this.lastName;
	}
}
public class Person {
	private final Name name;
	public Person(Name name){
		
		this.name = new Name(name.getFirstName() , name.getLastName());
		System.out.println("Person��Ĺ��췽��ִ�����,����һ���µĶ���");
	}
	public Name getName(){
		System.out.println("��getName����������һ������Name����");
		//return name;
		return  new Name(name.getFirstName() , name.getLastName());
	}
	public static void main(String[] args) {
		Name n = new Name("���" , "��");
		Person p = new Person(n);
		n.setFirstName("�˽�");
		System.out.println(p);
		System.out.println(p.getName().getFirstName());
		/*System.out.println(p.getName().getFirstName());*/
	}

}
