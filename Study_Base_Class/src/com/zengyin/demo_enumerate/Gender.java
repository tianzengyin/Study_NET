package com.zengyin.demo_enumerate;

public enum Gender implements GenderDesc {
		MALE("��"){
			public void info(){
				System.out.println("���ö��ֵ��������");
			}
		},FEMALE("Ů")
		{
			public void info(){
				System.out.println("���ö��ֵ����Ů��");
			}
		};
		private final String name;
		private Gender(String name){
			this.name = name;
		}
		
		/*public void setName(String name){
			switch(this){
			case MALE:
				if(name.equals("��")){
					this.name = name;
				}else{
					System.out.println("��������");
					return;
				}
				break;
			case FEMALE:
				if(name.equals("Ů")){
					this.name = name;
				}
				else{
					System.out.println("��������");
					return;
				}
				break;
				
			}
		}*/
		public String getName(){
			return this.name;
		}
		/*public void info(){
			System.out.println("����һ�����ڶ����Ա����");
		}*/
}
