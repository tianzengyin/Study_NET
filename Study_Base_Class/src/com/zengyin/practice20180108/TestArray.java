package com.zengyin.practice20180108;
//����������ñ���ָ��ͬһ����ַ,�ı�����һ�����ñ���������,��һ�����ñ���ָ�������Ҳ��ı�.
public class TestArray {

	public static void main(String[] args) {
           int[] i1 =new int[]{1,2,3,4,5};
           for(int i=0;i<i1.length; i++){
        	   System.out.print(i1[i]);
        	   
           }
           System.out.println();
           int[] i2;
           i2 = i1;
           for(int i=0;i<i2.length; i++){
        	  i2[i]=i2[i]+1;
        	   System.out.print(i2[i]);
           }
           System.out.println();
           for(int i=0;i<i1.length; i++){
        	   System.out.print(i1[i]);
        	   
           }
            
	}

}
