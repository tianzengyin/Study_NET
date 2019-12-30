package com.zengyin.practiceEnum20160106;

public class Coffee3 {
	CoffeeSize3 size;
	public static void main(String[] args) {
		Coffee3 drink = new Coffee3();
		drink.size = CoffeeSize3.HUGE;
		System.out.println(drink.toString() +"--" + drink.size.getOunces());
        /*Coffee3 drink2 = new Coffee3();
        drink2.size = CoffeeSize3.OVERWHELMING;*/
	}

}
enum CoffeeSize3{
	BIG(8),HUGE(10),OVERWHELMING(16);
	CoffeeSize3(int ounces){
		this.ounces = ounces;
	}
	private int ounces;
	public int getOunces(){
		return ounces;
	}
}