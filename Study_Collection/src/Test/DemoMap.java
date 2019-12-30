package Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		//1.使用Scanner获取用户输入的字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = sc.next();
		//2.创建Map集合,key是字符串中的字符,value是字符个数
		HashMap<Character,Integer> map = new HashMap<>();
		//3.遍历字符串,获取里面的每一个字符
		for(char ch:str.toCharArray()){
			//4.使用获取到的字符,去Map集合判断key是否存在
			if(map.containsKey(ch)){
				//key存在
				Integer value = map.get(ch);
				value++;
				map.put(ch, value);
			}else{
				//key不存在
				map.put(ch,1);
			}
		}
		//5.遍历Map集合,输出结果
		for(Character key:map.keySet()){
			Integer value = map.get(key);
			System.out.println(key+"..."+value);
		}
		
	}

}
