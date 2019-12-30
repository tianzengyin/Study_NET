package com.zengyin.Package1;

public class WrapperClass_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
	Integer inObj = 15 ;
	
	Object boolObj = false ;
	
	int  in = inObj ;
	System.out.println(in);
	if ( boolObj instanceof Boolean){
		 
		boolean b = (Boolean)boolObj;
		System.out.println(b);
		
	}
    Integer in1 = new Integer( 5 );
	
	int in1_1 = in1;
	System.out.println(in1_1);
		System.out.println();
	}

	public WrapperClass_Demo() {
		super();
		
	}*/ 
	String intStr = "123";
	int it1 = Integer.parseInt(intStr);
	int it2 = Integer.valueOf(intStr);
	System.out.println("it1="+it1+";it2="+it2);
	System.out.println("-------------------");
	String floatStr = "4.56";
	float ft1 = Float.parseFloat(floatStr);
	float ft2 = Float.valueOf(floatStr);
	System.out.println("ft1="+ft1+";ft2="+ft2);
	System.out.println("-------------------");
	String ftStr = String.valueOf(2.345f);
	System.out.println(ftStr);
	int in1 = Integer.bitCount(5);
	int in2 = Integer.bitCount(10);
	int in3 = Integer.bitCount(256);
	System.out.println(in1);
	System.out.println(in2);
	System.out.println(in3);
	System.out.println("-------------------");
	int in4 = Integer.bitCount(-5);
	int in5 = Integer.bitCount(-10);
	int in6 = Integer.bitCount(-256);
	System.out.println(in1);
	System.out.println(in2);
	System.out.println(in3);
	System.out.println("-------------------");
	Integer ina = 2;
	Integer inb = 2;
	System.out.println(ina == inb);
	Integer biga = 128;
	Integer bigb = 128;
	System.out.println(biga == bigb);
			
	
	
	}	
	
}