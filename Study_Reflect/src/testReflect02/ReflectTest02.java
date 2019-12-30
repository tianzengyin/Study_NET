package testReflect02;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: testReflect02
 * @VERSION:1.0
 */
public class ReflectTest02 {
    public static void main(String[] args){
        /*try {
           // 将A.class文件装载到JVM中发的过程
            Class.forName("testReflect02.A");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        //不会执行静态语句块
        Class c = A.class;
    }
}
class A{
    static {
        System.out.println("A......");
    }
}