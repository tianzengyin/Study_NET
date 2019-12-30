package com.zengyin.practice20180109;

public class Detergent extends Cleanser {
	
	public void scrub(){
		append("Detergent.scrub()");
		super.scrub();
	}
	public void foam(){
		append("foam()");
	}
	public static void main(String[] args) {
		Detergent detergent  = new Detergent();
		detergent.dilute();
		detergent.apply();
		detergent.scrub();
		detergent.foam();
		System.out.println(detergent);
		System.out.println("testing base class");
		Cleanser.main(args); 
	}

}

class Cleanser{
	
	private String s= "Cleanser";
	public void append(String a){
		s = s + a;
	}
	public void dilute(){
		append("dilite()");
	}
	
	public void apply(){
		append("apply()");
	}
	public void scrub(){
		append("scrub()");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args) {
		Cleanser cleanser = new Cleanser();
		cleanser.dilute();
		cleanser.apply();
		cleanser.scrub();
		System.out.println(cleanser);
	}
	
}
