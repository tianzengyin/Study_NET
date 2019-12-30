package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * 
 *斗地主综合案例01
 *		1.准备牌
 *		2.洗牌
 *		3.发牌
 *		4.排序
 *		5.看牌 
 **/
public class Doudizhu02 {

	public static void main(String[] args) {
		//1.准备牌
		//创建一个Map集合,存储牌的索引和组装好的牌
		HashMap<Integer,String> poker = new HashMap<>();
		//创建一个List集合,存储牌的索引
		ArrayList<Integer> pokerIndex = new ArrayList<>();
		//定义两个集合,存储花色和牌的序号
		List<String> colors = new ArrayList<>();
		colors.add("♠");
		colors.add("♥");
		colors.add("♣");
		colors.add("♦");
		List<String> nums = new ArrayList<>();
		nums.add("2");
		nums.add("A");
		nums.add("K");
		nums.add("Q");
		nums.add("J");
		nums.add("10");
		nums.add("9");
		nums.add("8");
		nums.add("7");
		nums.add("6");
		nums.add("5");
		nums.add("4");
		nums.add("3");
		
		//把大王和小王存储到集合中
		//定义一个索引
		int index= 0;
		poker.put(index, "大王");
		pokerIndex.add(index);
		index++;
		poker.put(index, "小王");
		pokerIndex.add(index);
		index++;
		//循环嵌套遍历两个集合,组装52张牌,存储到集合中
		for(String num:nums){
			for(String color:colors){
				poker.put(index, num+color);
				pokerIndex.add(index);
				index++;
			}
		}
		//2.洗牌
		/*Set<Integer> keys = poker.keySet();
		List<Integer> keysList = new ArrayList<>();
		keysList.addAll(keys);*/
		Collections.shuffle(pokerIndex);
		//3.发牌,存储玩家牌的索引,和底牌的索引
		ArrayList<Integer> player01 = new ArrayList<>();
		ArrayList<Integer> player02 = new ArrayList<>();
		ArrayList<Integer> player03 = new ArrayList<>();
		ArrayList<Integer> dipai = new ArrayList<>();
		//遍历存储牌索引的List集合,获取每一个牌的索引
		for(int i = 0;i<pokerIndex.size()-3;i++){
			Integer key = pokerIndex.get(i);
			//String value = poker.get(key);
			if(i%3==0){
				player01.add(key);
			}else if(i%3==1){
				player02.add(key);
			}else if(i%3==2){
				player03.add(key);
			}/*else if(i>=51){
				dipai.add(key);
			}*/
		}
		dipai.add(pokerIndex.get(pokerIndex.size()-3));
		dipai.add(pokerIndex.get(pokerIndex.size()-2));
		dipai.add(pokerIndex.get(pokerIndex.size()-1));
		//4.排序
		Collections.sort(player01);
		Collections.sort(player02);
		Collections.sort(player03);
		Collections.sort(dipai);
		//5.看牌
		lookPoker(poker, player01);
		lookPoker(poker, player02);
		lookPoker(poker, player03);
		lookPoker(poker, dipai);
	}

	public static void lookPoker(HashMap<Integer, String> poker,
			ArrayList<Integer> player01) {
		for(Integer key:player01){
			String value = poker.get(key);
			System.out.print(value+ " "  );
		}
		System.out.println();
	}

}
