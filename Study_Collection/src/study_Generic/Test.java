package study_Generic;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		
		
	}

	public static void genericInterfaceImpDemo() {
		//测试含有泛型的接口
		GenericInterfaceImpl01 gi1 = new GenericInterfaceImpl01();
		gi1.method("abc");
		GenericInterfaceImpl02<String> gi2 = new GenericInterfaceImpl02<>();
		gi2.method("aads");
		GenericInterfaceImpl02<Integer> gi3 = new GenericInterfaceImpl02<>();
		gi3.method(112);
	}

	public static void genericMethodTest() {
		//测试含有泛型的方法
		GenericMethod gm = new GenericMethod();
		gm.method01(10);
		gm.method01("abc");
		gm.method01(8.2);
		gm.method01(true);
		gm.method02("静态方法,不建议创建对象使用");
		GenericMethod.method02("静态方法");
		GenericMethod.method02(12111);
	}

	public static void genericClassDemo() {
		//不添加泛型,默认为Object类型
		GenericClass gc0 = new GenericClass<>();
		gc0.setName(111);
		Object object = gc0.getName();
		
		GenericClass<String> gc1 = new GenericClass<>();
		gc1.setName("aa");
		String str1 = gc1.getName();
		
		GenericClass<Integer> gc2 = new GenericClass<>();
		gc2.setName(111);
		Integer i = gc2.getName();
	}

}
