package com.zengyin.SystremTest;

import java.util.Properties;

/**
 * System:���еķ��������Զ��Ǿ�̬��
 *   out : ��׼��� Ĭ������Ļ
 *   in : ��׼���� Ĭ���Ǽ���
 *   
 * ����ϵͳһЩ��Ϣ
 * ��ȡϵͳ������Ϣ:Properties getProperties();
 * 
 * */
public class SyatemTest01 {

	public static void main(String[] args) {
		//Properties prop = System.getProperties();
		//��ΪProperties��Hashtable������,Ҳ����map���ϵ�һ���������
		//��ô����ͨ��Map����ȡ���ü����е�Ԫ��.
		
		/*��ȡ����������Ϣ
		for(Object obj : prop.keySet()){
			String value = (String)prop.get(obj);
			System.out.println(obj+".."+value);
		}
		*/
		
		//��ȡָ��������Ϣ
		String value = System.getProperty("os.name");
		sop(value);
		
	}
	 public static void sop(Object obj){
		 System.out.println(obj);
	 }
}
