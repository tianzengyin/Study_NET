package myselfAnnotationTest01;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMain {

	public static void main(String[] args) {
		
		try {
			//1.获取Person对应的类Class
			Class clazz = Person.class;
			//2.通过clazz获取属性
			Field field = clazz.getDeclaredField("name");
			//3.通过field获取上面的注解对象
			Annotation a1 = (Annotation) field.getAnnotation(MyAnnotation.class);
			//4.利用反射执行a1中的value方法
			Class aclazz = a1.getClass();//用a1对象获取它对应的class
			//5.通过aclazz获取里面的value的方法
			
				Method amethod = aclazz.getMethod("value");
		
			
			//6.执行value的方法 获取传递的信息
			String[] values;
			
				values = (String[])amethod.invoke(a1);
			
			
			//正常的对象调用执行过程
			//MyAnnotation a  = (MyAnnotation)field.getAnnotation(MyAnnotation.class);
			//4.利用a对象执行以下value 方法 帮我们搬运过来
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
