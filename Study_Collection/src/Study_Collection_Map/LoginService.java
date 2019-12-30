package Study_Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoginService {
	/*private String[] userBox1 = new String[]{"田增印","天津职业技术师范大学","工程实训中心"};
	private int[] passwordBox = new int[]{123,666,888};
	public String loginForArray(String name,String password){
		
		for(int i = 0;i<userBox.length;i++){
			if(userBox[i].equals(name)){
				if(passwordBox[i]==Integer.parseInt(password)){
					return "登陆成功";
				}
			}
		}
		return "用户名或密码错误";
	}*/
	//设计一个方法,用来登陆认证----ArrayList
/*	private List<String> userBox2 = new ArrayList<String>();
	{
		//初始化构造代码块,每创建一个对象就会执行一次,优先于构造函数执行
		userBox2.add("田增印-123");
		userBox2.add("天津职业技术师范大学-666");
		userBox2.add("工程实训中心-888");
	}
	public  String loginForList(String name,String password){
		for(int i =0;i<userBox2.size();i++){
			String[] value = userBox2.get(i).split("-");//一个人的信息,V[0]人名,v[1]密码
			if(value[0].equals(name)){
				if(value[1].equals(password)){
					return "登陆成功";
				}
			}
			
		}
		return "用户名或密码错误";
	}*/
	
	//设计一个方法,用来登陆认证----Set
	/*private Set<String> userBox3 = new HashSet<>();
	{
		//初始化构造代码块,每创建一个对象就会执行一次,优先于构造函数执行
		userBox3.add("田增印-123");
		userBox3.add("天津职业技术师范大学-666");
		userBox3.add("工程实训中心-888");
	}
	public String loginForSet(String name,String password){
		Iterator<String> it = userBox3.iterator();
		while(it.hasNext()){
			//String s = it.next();
			String[] value = it.next().split("-");//一个人的信息,V[0]人名,v[1]密码
			if(value[0].equals(name)&&value[1].equals(password)){
				return "登陆成功";
			}
		}
		return "用户名或密码错误";
	}*/
	//设计一个方法,用来登陆认证----Map
	private Map<String , Integer> userBox4 = new HashMap<>();
	{
		//初始化构造代码块,每创建一个对象就会执行一次,优先于构造函数执行
				userBox4.put("田增印",123);
				userBox4.put("天津职业技术师范大学",666);
				userBox4.put("工程实训中心",888);
	}
	public String loginForMap(String name,String password){
		
		
		Integer realPassword = userBox4.get(name);
		if(realPassword!=null &&  realPassword.equals(Integer.parseInt(password))){//人名存在
			return "登陆成功";
		}
		
		
		/*Set<String> keys = userBox4.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String s = it.next();
			Integer value = userBox4.get(s);
			if(s.equals(name)&&value.toString().equals(password)){
				return "登陆成功";
			}
		}*/
		return "用户名或密码错误";
	}
	public static void main(String[] args) {
		LoginService lg  = new LoginService();
	    //sop(lg.loginForList("田增印","1231"));
		//sop(lg.loginForSet("田增印","123"));
		sop(lg.loginForMap("田增印","123"));

	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}
