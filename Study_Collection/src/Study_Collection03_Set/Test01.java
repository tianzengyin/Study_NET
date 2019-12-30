package Study_Collection03_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * |--Set 元素是无序的,元素不可以重复
 *    |--HashSet:底层数据结构式哈希表
 *          HashSet是通过元素的hashcode  和 equals来完成
 *          如果元素的HashCode值相同,才会判断equals来完成
 *          如果元素的HashCode值不相同,不会调用equals
 * */

/**
 * 往hashSet集合中存入自定义对象
 * 姓名和年龄相同为同一个人,重复元素
 * */
public class Test01 {

	public static void main(String[] args) {
		Set<Person> hs = new HashSet<>();
		hs.add(new Person("a1",11));
		hs.add(new Person("a2",12));
		hs.add(new Person("a3",13));
		hs.add(new Person("a4",14));
		hs.add(new Person("a1",11));
		Iterator<Person> it = hs.iterator();
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName()+p.getAge());
		}
	}

}

class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		//System.out.println(this.name +"..hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}