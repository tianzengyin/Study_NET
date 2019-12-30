package com.zengyin.demo_enumerate;

public enum Gender implements GenderDesc {
		MALE("男"){
			public void info(){
				System.out.println("这个枚举值代表男性");
			}
		},FEMALE("女")
		{
			public void info(){
				System.out.println("这个枚举值代表女性");
			}
		};
		private final String name;
		private Gender(String name){
			this.name = name;
		}
		
		/*public void setName(String name){
			switch(this){
			case MALE:
				if(name.equals("男")){
					this.name = name;
				}else{
					System.out.println("参数错误");
					return;
				}
				break;
			case FEMALE:
				if(name.equals("女")){
					this.name = name;
				}
				else{
					System.out.println("参数错误");
					return;
				}
				break;
				
			}
		}*/
		public String getName(){
			return this.name;
		}
		/*public void info(){
			System.out.println("这是一个用于定义性别的类");
		}*/
}
