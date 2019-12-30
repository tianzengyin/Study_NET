package study_Generic;
/**
 * 含有泛型的接口,第一种使用方式:定义接口的实现类,实现接口,指定接口的泛型
 * 
 * 
 * */
public class GenericInterfaceImpl01 implements GenericInterface<String>{

	@Override
	public void method(String i) {
		System.out.println(i);
	}
	

}
