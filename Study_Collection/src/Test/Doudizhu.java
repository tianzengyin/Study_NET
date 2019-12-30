package Test;

import java.util.ArrayList;
import java.util.Collections;



/**
 * 
 *斗地主综合案例01
 *		1.准备牌
 *		2.洗牌
 *		3.发牌
 *		4.看牌 
 **/
public class Doudizhu {

	public static void main(String[] args) {
		//1.准备牌
		//定义一个存储54张牌的ArrayList 集合,泛型使用String
		ArrayList<String> poker = new ArrayList<>();
		//定义两个数组,一个存储数组的花色,一个存储数组的序号
		String[] colors = new String[]{"♠","♥","♣","♦"};
		String[] nums = new String[]{"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		//先把大王小王存储到扑克中
		poker.add("大王");
		poker.add("小王");
		//循环嵌套遍历52张牌
		for(String color: colors){
			for(String num:nums){
				poker.add(color+num);
			}
		}
		//System.out.println(poker);
		//2.洗牌
		Collections.shuffle(poker);
		//3.发牌
		//定义四个集合存储玩家的牌和底牌
		ArrayList<String> player01 = new ArrayList<>();
		ArrayList<String> player02 = new ArrayList<>();
		ArrayList<String> player03 = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		//4.遍历扑克,获取每一张牌
		for(int i =0;i<poker.size()-3;i++){
			String p = poker.get(i);
			if(i%3==0){
				player01.add(p);
			}else if(i%3==1){
				player02.add(p);
			}else if(i%3==2){
				player03.add(p);
			}/*else if(i>=51){
				dipai.add(p);
			}*/
		}
		dipai.add(poker.get(poker.size()-3));
		dipai.add(poker.get(poker.size()-2));
		dipai.add(poker.get(poker.size()-1));
		//5.看牌
		System.out.println(player01);
		System.out.println(player02);
		System.out.println(player03);
		System.out.println(dipai);
		
		Collections.sort(player01);
		Collections.sort(player02);
		Collections.sort(player03);
		Collections.sort(dipai);
		
		System.out.println(player01);
		System.out.println(player02);
		System.out.println(player03);
		System.out.println(dipai);
		
	}

}
