package com.zengyin.exceptionPractice01;

import java.util.Scanner;

/**
 * Ҫ��:����ģ��ע�����,����û����Ѵ���,���׳��쳣����ʾ:��,���û����Ѿ���ע��.
 * 		����:
 * 			1.ʹ�����鱣���Ѿ�ע������û���(���ݿ�)
 * 			2.ʹ��Scanner��ȡ�û������ע����û���(ǰ��,ҳ��)
 * 			3.����һ������,���û��������ע����û��������ж�
 * 				�����洢�Ѿ�ע������û���������,��ȡÿһ���û���
 * 				ʹ�û�ȡ�����û������û�������û����Ƚ�
 * 				true:�û����Ѿ�����,�׳�RegisterException�쳣,��֪�û�"��,���û����Ѿ���ע��"
 * 				false:���������Ƚ�
 * 			���ѭ��������,��û���ҵ��ظ����û���,��ʾ�û�"��ϲ��,ע��ɹ�"
 * */
public class DemoRegisterException {
	static String[] usernames = {"����","����","����"};
	
	public static void main(String[] args) /*throws RegisterException */{
		//2.ʹ��Scanner��ȡ�û������ע����û���(ǰ��,ҳ��)
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫע����û���:");
		String username = sc.next();
		checkUsername(username);
		
	}
	//3.����һ������,���û��������ע����û��������ж�
	public static void checkUsername(String username) /*throws RegisterException*/{
		//�����洢�Ѿ�ע������û���������,��ȡÿһ���û���
		for(String name:usernames){
			//ʹ�û�ȡ�����û������û�������û����Ƚ�
			if(name.equals(username)){
				//true:�û����Ѿ�����,�׳�RegisterException�쳣,��֪�û�"��,���û����Ѿ���ע��"
				try {
					throw new RegisterException("��,���û����Ѿ���ע��");
				} catch (RegisterException e) {
					
					e.printStackTrace();
					return ; //��������
				}
			}
		}
		//���ѭ��������,��û���ҵ��ظ����û���,��ʾ�û�"��ϲ��,ע��ɹ�"
		System.out.println("��ϲ��,ע��ɹ�");
	}

}
