package study_Generic;
/**
 * ���з��͵Ľӿ�,��һ��ʹ�÷�ʽ:����ӿڵ�ʵ����,ʵ�ֽӿ�,ָ���ӿڵķ���
 * 
 * 
 * */
public class GenericInterfaceImpl01 implements GenericInterface<String>{

	@Override
	public void method(String i) {
		System.out.println(i);
	}
	

}
