package testReflect02;

/**
 * @Auther:田增印
 * @Date: 2019/4/29
 * @Description: testReflect02
 * @VERSION:1.0
 */
public class Employee {
    //Field
    private String name;
    //Constructor
    public  Employee(){
        System.out.println(" Employee的无参构造方法执行");
    }
    public Employee(String name){
        this.name = name;
    }
    //方法Methed
    public void work(){
        System.out.println(this.name+"在工作！");
    }
}
