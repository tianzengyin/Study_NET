package testConstructor01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther:田增印
 * @Date: 2019/5/6
 * @Description: 获取某个特定的构造方法，创建对象
 * @VERSION:1.0
 */
public class TestConstructor02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取类
        Class c = Class.forName("testConstructor01.Customer");
        //2.获取特定构造方法
        Constructor declaredConstructor = c.getDeclaredConstructor(String.class, int.class);
        //3.创建对象
        Object o = declaredConstructor.newInstance("李四", 25);
        Customer c1 = (Customer)o;
        System.out.println("c1 = " + c1);
    }
}
class Customer{
    String name;
    int age;
    Customer(String name,int age){
        this.age=age;
        this.name =name;
    }
    public String toString(){
        return "Customer["+name+","+age+"]";
    }
}
