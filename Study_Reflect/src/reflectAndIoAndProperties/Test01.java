package reflectAndIoAndProperties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Auther:田增印
 * @Date: 2019/5/4
 * @Description: reflectAndIoAndProperties
 * @VERSION:1.0
 */
public class Test01 {
    public static void main(String[] args){
//        创建属性对象
        Properties p = new Properties();
        //2.创建流
        try {
            FileReader fr  = new FileReader(new File("D:\\ieda_workspace\\helloidea\\Study_Reflect\\src\\reflectAndIoAndProperties\\classInfo.properties"));
            //3.加载
            p.load(fr);
            //4.关闭流
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        String className = p.getProperty("className");
//        System.out.println("className = " + className);
        Class c = null;
        try {
            c = Class.forName(className);
            Object o = c.newInstance();
            System.out.println("o = " + o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
