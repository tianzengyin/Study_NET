package com.zengyin.Package1;

class Person2{
	private String  name;
	private String idStr;
	public Person2(){}
	public Person2(String name){
		this.name = name;
	}
	public Person2(String name , String idStr){
		this.name = name;
		this.idStr = idStr;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setIdStr(String idStr){
		this.idStr = idStr;
	}
	public String getIdStr(){
		return this.idStr;
	}
	
   
    /**
     * 重写equals()方法,提供自定义的相等标准
     * */
    public boolean equals(Object obj){
    	if(this == obj){
    		return true;
    	}
    	if(obj != null && obj.getClass() == Person2.class){
    		Person2 personObj = (Person2)obj;
    		if(this.getIdStr().equals(personObj.getIdStr())){
    			return true;
    		}
    	}
    	return false;
    }
    
}
class Dog{}
public class PrintObject_Demo {

	public static void main(String[] args) {
		/*Person2 p = new Person2("name"); 
		System.out.println(p);
		System.out.println(p.toString());
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.equals(str2));*/
		
		/*Person2 p = new Person2();
		System.out.println(p.equals(new Dog()));
		System.out.println(p.equals(new String("hello")));
		*/
		
		Person2 p1 = new Person2("孙悟空","1234");
		Person2 p2 = new Person2("孙悟空","1234");
		Person2 p3 = new Person2("孙悟空","2234");
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		                                                                                
		
	}

}
