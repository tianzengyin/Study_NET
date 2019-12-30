package testReflect02;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: 获取Class类型的对象后，可以创建该类的对象
 * @VERSION:1.0
 */
public class ReflectTest03 {
     public static void main(String[] args){
         try {
             Class<Employee> c = (Class<Employee>) Class.forName("testReflect02.Employee");
             Employee e = (Employee)c.newInstance();//调用了Employee的无参构造方法
             System.out.println("e = " + e);
             e.work();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }catch (IllegalAccessException e1) {
             e1.printStackTrace();
         }catch (InstantiationException e1) {
             e1.printStackTrace();
         }
     }
}
