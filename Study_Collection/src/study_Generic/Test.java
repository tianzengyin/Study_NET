package study_Generic;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		
		
	}

	public static void genericInterfaceImpDemo() {
		//���Ժ��з��͵Ľӿ�
		GenericInterfaceImpl01 gi1 = new GenericInterfaceImpl01();
		gi1.method("abc");
		GenericInterfaceImpl02<String> gi2 = new GenericInterfaceImpl02<>();
		gi2.method("aads");
		GenericInterfaceImpl02<Integer> gi3 = new GenericInterfaceImpl02<>();
		gi3.method(112);
	}

	public static void genericMethodTest() {
		//���Ժ��з��͵ķ���
		GenericMethod gm = new GenericMethod();
		gm.method01(10);
		gm.method01("abc");
		gm.method01(8.2);
		gm.method01(true);
		gm.method02("��̬����,�����鴴������ʹ��");
		GenericMethod.method02("��̬����");
		GenericMethod.method02(12111);
	}

	public static void genericClassDemo() {
		//����ӷ���,Ĭ��ΪObject����
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
