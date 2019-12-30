package testMethod01;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Auther:田增印
 * @Date: 2019/5/5
 * @Description: java.lang.reflect.Method
 * @VERSION:1.0
 */
public class ReflectMethod01 {
    public static void main(String[] args){
        Class  c =null;
        /*try {
            //获取类
            c = Class.forName("testMethod01.CustomerService");
            Method[] declaredMethods = c.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                //方法修饰符
                System.out.print(Modifier.toString(declaredMethod.getModifiers())+"---");
                //返回值类型
                Class typeReturnMethodClass = declaredMethod.getReturnType();
                String typeReturnMethodClassSimpleNameStr = typeReturnMethodClass.getSimpleName();
                System.out.print(typeReturnMethodClassSimpleNameStr+"---");
                //方法名
                System.out.println(declaredMethod.getName());
                //方法的形式参数列表
                Class[] parameterTypes = declaredMethod.getParameterTypes();
                for (Class parameterType : parameterTypes) {
                    String simpleName = parameterType.getSimpleName();
                    System.out.print(simpleName);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        //反编译
        //获取类
        try {
            //c = Class.forName("testMethod01.CustomerService");
            c = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers())+" class ");
        sb.append(c.getSimpleName()+" {\n");
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            //方法修饰符
            sb.append(Modifier.toString(declaredMethod.getModifiers())+"  ");
            //返回值类型
            Class typeReturnMethodClass = declaredMethod.getReturnType();
            String typeReturnMethodClassSimpleNameStr = typeReturnMethodClass.getSimpleName();
            sb.append(typeReturnMethodClassSimpleNameStr+"  ");
            //方法名
            sb.append(declaredMethod.getName());
            sb.append(" ( ");
            //方法的形式参数列表
            Class[] parameterTypes = declaredMethod.getParameterTypes();
            for (int i = 0;i<parameterTypes.length;i++) {
                Class parameterType = parameterTypes[i];
                String simpleName = parameterType.getSimpleName();
                if( i != parameterTypes.length-1){
                    sb.append(simpleName+" , ");
                }else{
                    sb.append(simpleName);
                }

            }
            sb.append(" ) { }\n");
        }
        sb.append(" }");
        System.out.println(sb);
    }
}
