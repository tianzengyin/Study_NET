package com.zengyin.practiceEnum20160106;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.HUGE;
        Coffee2 drink2 = new Coffee2();
       // drink2.size = Coffee2.CoffeeSize2.�ܴ��;
	}

}

enum CoffeeSize{
	BIG, HUGE, OVERWHELMING
	//���,�ܴ��,�����
}
class Coffee{
	CoffeeSize size;
}
class Coffee2{
	//enum CoffeeSize2{���,�ܴ��,�����};
	//CoffeeSize2 size;
	
}