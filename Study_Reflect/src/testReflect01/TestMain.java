package testReflect01;

public class TestMain {

	public static void main(String[] args) {
		//ͨ��һ��Class����������Person.class���ļ�����ӳ���ϵ
		try {
			Class clazz = Class.forName("testReflect01.Person");
			
			//��������
			
			//clazz.newInstance();//�൱�ڵ���Person���е�Ĭ���޲ι��췽����������,Ĭ�Ϸ���Object����
			Person p = (Person)clazz.newInstance();
			System.out.println(p);
			
			//int nameFiled =nameFiled.getModifiers(); 
			
			
			
			//�����Լ��Ľṹ Ȩ�����η� �������η� ������ �̳� ʵ��
			//int modifiers = clazz.getModifiers();//��ȡ������η�(Ȩ�� ����)
			//ÿһ�����η� ��һ����������ʾ 
			//��0��ʼ----> 0 1 2 4 8 16 32 64 128 256 512 
			//0-->Ĭ�ϲ�д     1-->public  2-->private  4-->protected  8-->static 
			//16-->final  32-->synchronized  64-->volatile  128-->transient
			//512 -->interface  1024-->abstract
			/*System.out.println(modifiers);
			//�������
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
