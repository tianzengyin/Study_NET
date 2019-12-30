package testMethod01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther:田增印
 * @Date: 2019/5/5
 * @Description: 获取某个特定的方法，通过反射机制执行。
 *                以前：
 *                CustomerService cs = new CustomerService();
 *                boolean ioSuccess = cs.login("admin","123");
 *                然后通过反射机制执行此方法？
 * @VERSION:1.0
 */
public class ReflectMethod02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.获取类
        Class cs = Class.forName("testMethod01.CustomerService");
        //2.获取某个特定的方法
        //通过：方法名+形参列表
        try {
            Method login = cs.getDeclaredMethod("login", String.class, String.class);
            //通过反射机制执行login方法

            Object o = cs.newInstance();
           /* if(o instanceof CustomerService){
                CustomerService c = (CustomerService)o;
                c.login("admin","123");
            }*/
            //调用o对象的login方法，传递"admin","123",方法的执行结果retValue
            Object retValue = login.invoke(o, "admin", "123");
            System.out.println("retValue = " + retValue);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
