package com.zengyin.practice20180108;

public class Sundae {
	//私有的数据成员,公共的方法
	private Sundae(){}
	static Sundae makeASundae(){
		return new Sundae();
	}
}
