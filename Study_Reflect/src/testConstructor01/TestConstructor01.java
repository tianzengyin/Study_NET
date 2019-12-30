package testConstructor01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @Auther:田增印
 * @Date: 2019/5/5
 * @Description: 获取构造方法
 * @VERSION:1.0
 */
public class TestConstructor01 {
    public static void main(String[] args){
        //获取类
        Class c = null;
        try {
            c = Class.forName("java.lang.String");
           /* //2.获取所有的构造
            Constructor[] declaredConstructors = c.getDeclaredConstructors();
            for (Constructor declaredConstructor : declaredConstructors) {
                //获取修饰符
                String s = Modifier.toString(declaredConstructor.getModifiers());
                System.out.print(s+"  ");
                //获取构造方法名
                String nameConstructorStr = c.getSimpleName();
                System.out.print(nameConstructorStr);
                System.out.print("( ");
                //构造方法的形式参数列表
                Class[] parameterType = declaredConstructor.getParameterTypes();
                for (int i = 0; i <parameterType.length ; i++) {
                    String simpleNameParameterType = parameterType[i].getSimpleName();
                    if(i!=parameterType.length-1){
                        System.out.print(simpleNameParameterType+" , ");
                    }else{
                        System.out.print(simpleNameParameterType);
                    }
                }
                System.out.print(") ");
                System.out.println("{ }");
            }*/

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //反编译
        StringBuffer sb  = new StringBuffer();

        sb.append(Modifier.toString(c.getModifiers())+" class " + c.getSimpleName()+"{\n");
        Constructor[] declaredConstructors = c.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            //获取修饰符
            String s = Modifier.toString(declaredConstructor.getModifiers());
            sb.append(s+"  ");
            //获取构造方法名
            String nameConstructorStr = c.getSimpleName();
            sb.append(nameConstructorStr+"( ");
            //构造方法的形式参数列表
            Class[] parameterType = declaredConstructor.getParameterTypes();
            for (int i = 0; i <parameterType.length ; i++) {
                String simpleNameParameterType = parameterType[i].getSimpleName();
                if(i!=parameterType.length-1){
                    sb.append(simpleNameParameterType+" , ");
                }else{
                    sb.append(simpleNameParameterType);
                }
            }
            sb.append(") ");
            sb.append("{ }\n");
        }

        sb.append("}");

        System.out.println(sb);
    }
}
