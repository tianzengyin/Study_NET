package testField01;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Auther:田增印
 * @Date: 2019/5/4
 * @Description: 类中的属性
 * @VERSION:1.0
 */
public class TestField01 {
    public static void main(String[] args){
        //getField01();
        //getField02();
        //getFieldType01();
        //getFieldTypeSimple01();
        //getFieldModifierStr01();
        StringBuffer sb = new StringBuffer();

        try {
//            Class c = Class.forName("testField01.User");
            Class c = Class.forName("java.lang.Integer");
            int modifierClass = c.getModifiers();
            String modifierClassStr = Modifier.toString(modifierClass);
            sb.append(modifierClassStr);
            sb.append("\t");
            sb.append("class");
            sb.append("\t");
            sb.append(c.getSimpleName()+"{");
            sb.append("\n");
            Field[] declaredFields = c.getDeclaredFields();
            for (Field declaredField : declaredFields) {


                int modifiersField = declaredField.getModifiers();
                String modifiersFieldStr = Modifier.toString(modifiersField);
                sb.append(modifiersFieldStr);

                sb.append("\t");

                Class typeFiledClass = declaredField.getType();
                String typeFiledClassSimpleName = typeFiledClass.getSimpleName();
                sb.append(typeFiledClassSimpleName);

                sb.append("\t");

                String declaredFieldName = declaredField.getName();
                sb.append(declaredFieldName);

                sb.append(";\n");

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        sb.append("}");
        System.out.println( sb);


    }

    /**
     * 以字符串形式获取整个类的修饰符
     */
    private static void getFieldModifierStr01() {

        try {
            Class c = Class.forName("testField01.User");
            //获取属性Field
            Field[] fields = c.getDeclaredFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                int modifiers = field.getModifiers();
                System.out.print( modifiers +"--");
                String s = Modifier.toString(modifiers);
                System.out.print(s+"--");
                Class type = field.getType();
                System.out.print(type.getSimpleName()+"--");
                System.out.println(field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getFieldTypeSimple01() {
        //获取整个类
        try {
            Class c = Class.forName("testField01.User");
            //获取属性Field
            Field[] fields = c.getDeclaredFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                Class type = field.getType();
                System.out.print(type.getSimpleName()+"--");
                System.out.println(field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取属性的类型
     */
    private static void getFieldType01() {
        //获取整个类
        try {
            Class c = Class.forName("testField01.User");
            //获取属性Field
            Field[] fields = c.getDeclaredFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                Class type = field.getType();
                System.out.println(type.getName());
                //System.out.println(field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取所有修饰符的属性
     */
    private static void getField02() {
        //获取整个类
        try {
            Class c = Class.forName("testField01.User");
            //获取属性Field
            Field[] fields = c.getDeclaredFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                System.out.println(field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取属性为public 的属性
     */
    private static void getField01() {
        //获取整个类
        try {
            Class c = Class.forName("testField01.User");
         //获取属性Field
            Field[] fields = c.getFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                System.out.println(field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
