package com.zengyin.demo_enumerate;

public class EnumTest {
	//private static final SeasonEnum  = null;
	public void judge(SeasonEnum s){
		switch(s){
		case SPRING:System.out.println("��ů����,����̤��");break;
		case SUMMER:System.out.println("��������,�ʺ���Ӿ");break;
		case FALL:System.out.println("�����ˬ,������ʱ");break;
		case WINTER:System.out.println("����ѩƮ,Χ¯��ѩ");break;
		}
	}
		public static void main(String[] args) {
			for(SeasonEnum s : SeasonEnum.values()){
				System.out.println(s);
			}
			new EnumTest().judge(SeasonEnum.SPRING);
			int a = SeasonEnum.SUMMER.compareTo(SeasonEnum.FALL);
		    boolean b = SeasonEnum.SUMMER.SeasonEnumFor(SeasonEnum.FALL);
		    System.out.println(b);
		    System.out.println(a);
		    String name1 = SeasonEnum.SUMMER.name();
		    System.out.println(name1);
		    System.out.println(SeasonEnum.SUMMER.ordinal());
		    System.out.println(SeasonEnum.SUMMER.toString());
		    SeasonEnum FALL1 = SeasonEnum.valueOf(SeasonEnum.class, "FALL");
		    System.out.println(FALL1);
	}

}
