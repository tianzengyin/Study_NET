package com.zengyin.IntegerTest;
/**
 * �����������Ͷ����װ��
 * byte    Byte
 * short   short
 * int     Integer
 * long    Long 
 * boolean Boolean
 * float   Float
 * double  Double
 * char    Character
 * 
 * �����������Ͷ����װ����������
 * �������ڻ����������ͺ��ַ���֮����ת��
 * 
 * ������������ת���ַ���
 *   
 *   : ������������+""
 *   ������������.toString(������������)
 *   ��:Integer.toString(34);//��35�������"34"
 * 
 * �ַ���ת�ɻ�����������
 * 		xxx a = Xxx.parseXxx("12");
 *      int a = Integer.parseint("12");
 *      double d = Double.parseDouble("120.35");
 *      
 * 
 * */
public class IntegerTest01 {

	public static void main(String[] args) {
		//�����������ֵ
		//��һ���ַ���ת������
		int num = Integer.parseInt("123");
		sop("num = "+(num+5));
	}
	public static void sop(String str){
		System.out.println(str);
	}

}
