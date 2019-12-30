package com.zengyin.demo_enumerate;

public class GenderTest {

	public static void main(String[] args) {
			extracted();
			
	}

	public static void extracted() {
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		//g.name = "女";
		//g.name = "男";
		//g.setName("女");
		//System.out.println(g + "代表" + g.getName());
		//g.setName("男");
		//System.out.println(g + "代表" + g.getName());
		Gender.MALE.info();
		Gender.FEMALE.info();
		g.info();
	}

}
