package testField01;

import java.lang.reflect.Field;

/**
 * @Auther:田增印
 * @Date: 2019/5/4
 * @Description: 获取某个指定的属性
 * @VERSION:1.0
 */
public class TestField02 {
    public static void main(String[] args){
        //获取类
        try {
            Class c = Class.forName("testField01.User");
            //获取id属性
            Field idField = c.getDeclaredField("id");

            Object o = c.newInstance();
            //打破封装
            idField.setAccessible(true);
            //给o对象的id属性赋值“110”
            idField.set(o,"110");//set

            //get
            Object o1 = idField.get(o);
            System.out.println("o1 = " + o1);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
