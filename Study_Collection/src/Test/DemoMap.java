package Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {
		//1.ʹ��Scanner��ȡ�û�������ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String str = sc.next();
		//2.����Map����,key���ַ����е��ַ�,value���ַ�����
		HashMap<Character,Integer> map = new HashMap<>();
		//3.�����ַ���,��ȡ�����ÿһ���ַ�
		for(char ch:str.toCharArray()){
			//4.ʹ�û�ȡ�����ַ�,ȥMap�����ж�key�Ƿ����
			if(map.containsKey(ch)){
				//key����
				Integer value = map.get(ch);
				value++;
				map.put(ch, value);
			}else{
				//key������
				map.put(ch,1);
			}
		}
		//5.����Map����,������
		for(Character key:map.keySet()){
			Integer value = map.get(key);
			System.out.println(key+"..."+value);
		}
		
	}

}
