package com.zengyin.Package1;


public class MathTest {

	public static void main(String[] args) {
		//������ת���ɽǶ�
		System.out.println("Math.toDegrees(1.57): " + Math.toDegrees(1.57));
		//���Ƕ�ת���ɻ���
		System.out.println("Math.toRadians(90): " + Math.toDegrees(90));
		//���㷴����,���صĽǶȷ�Χ��0.0��pi֮��,������-1��1֮��
		System.out.println("Math.acos(1):" + Math.acos(1));
		//���㷴����,���صĽǶȷ�Χ��-pi/2 �� pi/2 ֮��
		System.out.println("Math.asin(0.8):" + Math.asin(0.8));
		//���㷴����,���صĽǶȷ�Χ��-pi/2 �� pi/2 ֮��
		System.out.println("Math.atan: " + Math.atan(2.3));
		//������������
		System.out.println("Math.cos(1.57):" + Math.cos(1.57));
		//����˫������
		System.out.println("Math.cosh(1.2):" + Math.cosh(1.2));
		//��������
		System.out.println("Math.sin(1.57):" + Math.sin(1.57));
		
		/*---------������ȡ������-----------*/
		System.out.println("Math.floor(-1.2)" + Math.floor(-1.2));
		System.out.println("Math.ceil(-1.2)" + Math.ceil(-1.2));
		System.out.println("Math.floor(2.6)" + Math.floor(2.6));
		System.out.println("Math.ceil(2.6)" + Math.ceil(2.6));
		/*----------�����ǳ˷�,����,ָ������------------------------*/
		//����ƽ����
		System.out.println("Math.sqrt(4):" + Math.sqrt(4));
		//����������
		System.out.println("Math.cbrt(9)" + Math.cbrt(9.0));
		System.out.println(Math.random());
		
	}

}
