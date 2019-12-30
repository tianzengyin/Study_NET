package myselfAnnotationTest01;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMain {

	public static void main(String[] args) {
		
		try {
			//1.��ȡPerson��Ӧ����Class
			Class clazz = Person.class;
			//2.ͨ��clazz��ȡ����
			Field field = clazz.getDeclaredField("name");
			//3.ͨ��field��ȡ�����ע�����
			Annotation a1 = (Annotation) field.getAnnotation(MyAnnotation.class);
			//4.���÷���ִ��a1�е�value����
			Class aclazz = a1.getClass();//��a1�����ȡ����Ӧ��class
			//5.ͨ��aclazz��ȡ�����value�ķ���
			
				Method amethod = aclazz.getMethod("value");
		
			
			//6.ִ��value�ķ��� ��ȡ���ݵ���Ϣ
			String[] values;
			
				values = (String[])amethod.invoke(a1);
			
			
			//�����Ķ������ִ�й���
			//MyAnnotation a  = (MyAnnotation)field.getAnnotation(MyAnnotation.class);
			//4.����a����ִ������value ���� �����ǰ��˹���
			//String[] values1 = a.value();
			for(String value:values){
				System.out.println(value);
			}
			//System.out.println();
			
		} catch (NoSuchFieldException | SecurityException | NoSuchMethodException | IllegalAccessException |
				IllegalArgumentException  | InvocationTargetException e) {
			
			e.printStackTrace();
		}
	}

}
