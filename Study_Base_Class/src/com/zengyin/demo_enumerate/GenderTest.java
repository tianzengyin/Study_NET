package com.zengyin.demo_enumerate;

public class GenderTest {

	public static void main(String[] args) {
			extracted();
			
	}

	public static void extracted() {
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		//g.name = "Ů";
		//g.name = "��";
		//g.setName("Ů");
		//System.out.println(g + "����" + g.getName());
		//g.setName("��");
		//System.out.println(g + "����" + g.getName());
		Gender.MALE.info();
		Gender.FEMALE.info();
		g.info();
	}

}
