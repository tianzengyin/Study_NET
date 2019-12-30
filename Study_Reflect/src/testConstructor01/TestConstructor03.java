package testConstructor01;

/**
 * @Auther:田增印
 * @Date: 2019/5/6
 * @Description: 关于获取父类和父接口
 * @VERSION:1.0
 */
public class TestConstructor03 {
    public static void main(String[] args) throws ClassNotFoundException {
    //通过反射机制获取String类的父类和父接口
        Class sClass = Class.forName("java.util.Date");
       //获取父类
        Class superclassString = sClass.getSuperclass();
        String simpleName = superclassString.getSimpleName();
        String typeName = superclassString.getTypeName();
        System.out.println(simpleName+"---"+typeName);
        //获取父接口
        Class[] interfaces = sClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }
    }
}
