package com.zengyin.practice20180109;

public class SprinklerSystem {
	
	private String value1,value2,value3,value4;
	
	private WaterSource source ;//= new WaterSource();
	private int i;
	private float f;
	
	
	@Override
	public String toString() {
		return "SprinklerSystem [value1=" + value1 + ", value2=" + value2
				+ ", value3=" + value3 + ", value4=" + value4 + ", source="
				+ source + ", i=" + i + ", f=" + f + "]";
	}


	public static void main (String[] args){
		SprinklerSystem sprinkles = new SprinklerSystem();
		System.out.println(sprinkles.toString());
	}
}

class WaterSource{
		private String s;
		WaterSource(){
			System.out.println("WaterSource()");
			s = "Constructed";
		}
		public String toString(){
			return s;
		}
}