package com.zengyin.Package3;

public class OutputFactory {
	public Output getOutput(){
		return new Printer();
	}
	public static void main(String[] args){
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("���");
		//c.print();
		c.keyIn("�ӱ�");
		c.print();
	}
}
