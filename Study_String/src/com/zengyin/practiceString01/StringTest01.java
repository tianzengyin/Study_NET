package com.zengyin.practiceString01;

/**
 * �����Ĳ�������:
 *   	1.��ȡ
 *        1.1�ַ����а������ַ���,Ҳ�����ַ����ĳ���.
 *        	  int lengt():��ȡ����
 *        1.2����λ�û�ȡĳ���ַ�
 *            char charAt(int index)
 *        1.3�����ַ���ȡ���ַ����ַ�����λ��
 *            int indexOf(int ch):���ص���ch���ַ����е�һ�γ��ֵ�λ��
 *            int indexOf(int ch, int fromIndex) :��fromIndexָ����ʼλ�û�ȡch���ַ����е�һ�γ��ֵ�λ��
 *            int indexOf(String str) : ���ص���str���ַ����е�һ�γ��ֵ�λ��
 *            int indexOf(String str, int fromIndex) :��fromIndexָ����ʼλ�û�ȡstr���ַ����е�һ�γ��ֵ�λ��
 *   	2.�ж�
 *        2.1�ַ����Ƿ����ĳһ���Ӵ�.
 *           boolean contains(str):�жϴ��ַ����Ƿ����
 *           ����֮��:indexOf(str):��������str��һ�γ��ֵ�λ��,�������-1,��ʾ��str�����ַ����д���
 *                    ����,Ҳ�������ڶ�ָ���ж��Ƿ����.
 *                       if(str.indexOf("aa")!=-1)
 *                       
 *                       ���Ҹ÷����������ж�,�ֿ��Ի�ȡ���ֵ�λ��.
 *                       
 *        2.2�ַ����Ƿ�������.
 *          boolean isEmpty() :���� true������ҽ��� length()Ϊ 0 �� 
 *        2.3�ַ����Ƿ�����ָ�����ݿ�ͷ.
 *          boolean startsWith(String prefix) :���Դ��ַ����Ƿ���ָ����ǰ׺��ͷ��
 *          
 *        2.4�ַ�������ʲô������β.
 *          boolean endsWith(String prefix) :���Դ��ַ����Ƿ���ָ���ĺ�׺��β��
 *        2.5�ж��ַ��������Ƿ���ͬ
 *          boolean equals(str):  ��д��Object���е�equals����
 *        2.6�ж������Ƿ���ͬ,�����Դ�Сд.
 *           boolean equalsIgnoreCase();
 *       3.ת��.
 *        3.1���ַ�����ת���ַ���.
 *            ���캯��: String(char[])
 *                    String(char[],offset,count):���ַ������е�һ����ת���ַ���
 *            ��̬����: static String valueOf(char[] data) ;
 *                    static String valueOf(char[] data, int offset, int count) ;        
 *        3.2���ַ���ת���ַ�����.
 *           char[] toCharArray() ;
 *        3.3���ֽ�����ת���ַ���.
 *           ���췽��:String(byte[] bytes) 
 *                  String(byte[] bytes, Charset charset) :����һ���µ�String��ָ����ָ�����ֽڵ��������charset �� 
 *                  String(byte[] bytes, int offset, int length) 
 *        3.4���ַ���ת���ֽ�����.
 *           byte[] getBytes(String charsetName) 
 *        3.5��������������ת���ַ���.
 *           static String valueOf(int)
 *           Static String valueOf(duble) 
 *           
 *             3 + "";//String.valueOf(3);
 *             
 *             ����:�ַ������ֽ�������ת��������,����ָ�������.
 *       4 �滻
 *          String replace(char oldChar, char newChar)       
 *       5 �и�
 *          String[] split(String regex)
 *       6 �Ӵ�
 *          ��ȡ�ַ����е�һ����
 *          String substring(int beginIndex)   
 *          String subSequence(int beginIndex, int endIndex)  
 *        7 ת��  ȥ���ո�  �Ƚ� 
 *          7.1 ���ַ���ת�ɴ�д��Сд
 *               String toUpperCase();
 *               String toLowerCase();
 *          7.2 ���ַ������˵Ŀո�ȥ��
 *               String trim();
 *          7.3 �������ַ���������Ȼ˳��ıȽ� 
 *               int compareTo(String)
 * */
public class StringTest01 {
	public static void method_7(){
		String s = "   Hello JaVa   ";
		sop(s.toUpperCase());
		sop(s.toLowerCase());
		sop(s.trim());
	}
	public static void method_sub(){
		
		String s = "abcdefg";
		//sop(s.substring('c'));
		sop(s.subSequence(1, 5));//����ͷ,������β
		sop(s.substring(3));//��ָ��λ�õ���β
	}
	public static void method_split(){
		String s = "����,����,����,����";
		String[] arr = s.split(",");
		//sop(arr.toString());
		for(int i = 0 ;i<arr.length;i++){
			sop(arr[i]);
			
		}
		//String[] str  = {"������,���,С��Ů"};
	}
	public static void method_replace(){
		String s  = "adasdssdsfgfsfdg";
		
		String str = "���ʡ������";
		
		sop(str.replace("���", "�ӱ�"));
		sop(str);
		sop(s.replace('a', 'b'));
		sop(s);
	}
	public static void method_trans(){
		
		char[] arr = {'a','b','c','d','e','f'};
		String Sarr = new String(arr,1,3);
		sop(Sarr);
	}
	public static void method_is(){
		String str = "ArrayDome.java";
		//�ж��ļ��������Ƿ���Array���ʿ�ͷ
		sop(str.startsWith("Array"));
		//�ж��ļ��������Ƿ���.java���ļ� 
		sop(str.endsWith(".java"));
		//�ж��ļ������Ƿ����Demo
		sop(str.contains("Demo"));
	}
	public static void method_get(){
		
		String str = "abcfrcdea";
		sop(str.length());
		sop(str.charAt(3));
		sop(str.indexOf('a',3));
		sop(str.lastIndexOf('c',4));
		sop(str.lastIndexOf(97));
		
	}
	public static void main(String[] args) {
		/*String s1 = "abc";//�ڴ�����һ������,���ڳ�����
		String s2 = new String("abc");//�ڴ�������������
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));//String�ิд��Object���е�equals����,
		                                  //�÷��������ж��ַ����Ƿ���ͬ
*/		
		//method_get();
		//method_is();
		//method_trans();
		//method_replace();
		//method_split();
		//method_sub();
		method_7();
	}
	public static void sop(Object obj){
		System.out.println(obj);
		
	}

}
