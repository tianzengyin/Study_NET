package com.zengyin.practiceEnum20160106;

public class EnumOrder {

	public static void main(String[] args) {
		for(Spiciness s : Spiciness.values()){
			System.out.println(s+","+ s.ordinal());
		}
	}

}
