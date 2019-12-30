package testReflect01;

public class TestMain {

	public static void main(String[] args) {
		//通过一个Class对象来操作Person.class类文件产生映射关系
		try {
			Class clazz = Class.forName("testReflect01.Person");
			
			//创建对象
			
			//clazz.newInstance();//相当于调用Person类中的默认无参构造方法创建对象,默认返回Object对象
			Person p = (Person)clazz.newInstance();
			System.out.println(p);
			
			//int nameFiled =nameFiled.getModifiers(); 
			
			
			
			//类有自己的结构 权限修饰符 特征修饰符 类名字 继承 实现
			//int modifiers = clazz.getModifiers();//获取类的修饰符(权限 特征)
			//每一个修饰符 用一个整数来表示 
			//从0开始----> 0 1 2 4 8 16 32 64 128 256 512 
			//0-->默认不写     1-->public  2-->private  4-->protected  8-->static 
			//16-->final  32-->synchronized  64-->volatile  128-->transient
			//512 -->interface  1024-->abstract
			/*System.out.println(modifiers);
			//类的名字
			String name = clazz.getName();
			String simpleName = clazz.getSimpleName();
			System.out.println(name+"----"+simpleName);
			
			System.out.println(clazz.getPackage().getName());
			
			System.out.println("------------");*/
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		/*ArrayList<String> list = new ArrayList<>();
		Class clazz = ArrayList.class;
		Class sclazz =clazz.getSuperclass();
		while(sclazz!=null){
			System.out.println(sclazz.getName());
			sclazz = sclazz.getSuperclass();
		}
		Class[] classes = clazz.getInterfaces();
		for(Class c : classes){
			System.out.println(c.getName());
		}*/ catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		}
	}

}
