package testMethod01;

/**
 * @Auther:田增印
 * @Date: 2019/5/5
 * @Description: 用于测试TestMethod01.java
 * @VERSION:1.0
 */
public class CustomerService {


    /**
     * 登录
     * @param name
     * @param pwd
     * @return
     */
    public boolean login(String name,String pwd){
        if("admin".equals(name) && "123".equals(pwd)){
            return true;
        }
        return false;
    }

    /**
     * 退出
     */
    public void logout(){
        System.out.println("系统已安全退出");
    }
}
