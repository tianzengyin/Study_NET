package com.zengyin.Package3;

public class OutputFactory {
	public Output getOutput(){
		return new Printer();
	}
	public static void main(String[] args){
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("Ìì½ò");
		//c.print();
		c.keyIn("ºÓ±±");
		c.print();
	}
}
