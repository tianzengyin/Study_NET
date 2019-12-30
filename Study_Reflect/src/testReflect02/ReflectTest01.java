package testReflect02;

import java.util.Date;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: 获取Class类型对象的三种方式
 * @VERSION:1.0
 */
public class ReflectTest01 {
    public static void main(String[] args) throws  Exception{
        //第一种方式：
        Class c1 = Class.forName("testReflect02.Employee");
        //try {
           // c1 = Class.forName("Employee");
            //c1引用保存内存地址指向堆中的对象，该对象代表的是Employee的整个对象
       /* } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        //第二种方式：
        //java中每个类型都有class属性
        Class c2 = Employee.class;

        //第三种方式：
        //java语言中任何一个java对象都有getClass方法
        Employee e = new Employee();
        Class c3 = e.getClass();//c3 是运行时类(e的运行时类是Employee)
        System.out.println("c1= "+c1);
        System.out.println("c2= "+c2);
        //因为Employee类在JVM中只有一个，所以c1,c2,c3的内存地址是相同的，指向堆中的唯一一个对象
        System.out.println("c1 == c2"+(c1==c2));
        System.out.println("c2 == c3"+(c2==c3));

        Class c4 = Date.class;//c4代表Date这个类

        Class c5  = Class.forName("java.util.Date");//必须写类全名 类全名带有包名

    }



}

