package com.zengyin.exceptionPractice01;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 * �쳣��
 * ��ʲô���Ƕ��������������������ж���ķ�װ
 * --------------
 * 
 * �쳣��ϵ��
 *    Throwable
 *    	  |--Error
 *        |--Exception
 *               |--RuntimeException
 *  �쳣��ϵ���ص㣺�쳣��ϵ�е��������Լ������Ķ��󶼾߱�������
 *              Ҳ����˵���Ա�throw �� throws�ؼ�����������
 *              ֻ���쳣��ϵ�߱�����ص�
 * --------------
 * throw ��throws ���÷���
 *  throw�����ں����ڣ������׳��쳣��
 *  throws�����ں����ϣ������׳��쳣�࣬�����׳�����ö��Ÿ�����
 *  
 *  ������������throw �׳��쳣���󣬲�δ����try������
 *                 ����Ҫ�ں������������������ʧ�ܡ�
 *     ע�⣺RuntimeException���⣬Ҳ��˵������������׳���Runtime�쳣�������Ͽ��Բ�������
 *     ��������������쳣����������Ҫ���д�����������������throws����try
 * --------------    
 *     �쳣�����֣�
 *        ����ʱ������쳣
 *           ���쳣�ڱ���ʱ�����û�д�����û����Ҳû��try��,����ʧ�ܡ�
 *           ���쳣����ʶ�������ſ��Ա�������
 *        ����ʱ�쳣������ʱ����⣩
 *           �ڱ���ʱ������Ҫ����������������顣
 *           ���쳣�ķ��������鲻�������ó���ֹͣ����Ҫ�Դ������������
 * --------------
 *�쳣������䣺
 *	try{
 *		��Ҫ�����Ĵ���
 *	}catch(){
 *		�����쳣�Ĵ���
 *	} finlly{
 *      һ����ִ�еĴ���
 *  }
 *  
 *  �����ֽ�Ϸ�ʽ��
 *  1.  try{
 *     
 *     }catch(){
 *     
 *     }
 *     
 *  2.  try{
 *     
 *     }finally{
 *     
 *     }
 *    
 *  3.  try{
 *  
 *     }catch(){
 *     
 *     }finally{
 *     
 *     }
 * 
 * 
 *ע�� :
 *   1.finally�ж����ͨ���� �ر���Դ���� �� ��Ϊ��Դ����Ҫ�����ͷš�
 *   2.finallyֻ��һ���������ִ�У���ִ�е�System.exit(0);finally����ִ��
 * --------------  
 * 
 *�Զ����쳣��
 *   ������̳�Exception����RuntimeException
 *   1.Ϊ�����Զ�����߱������ԡ�
 *   2.�ø���߱������쳣�Ĺ��Է�����
 *   
 *   ��Ҫ�Զ����쳣����Ϣʱ������ʹ�ø����Ѿ�����õĹ��ܡ�
 *   �쳣��Ϣ���ݸ�����Ĺ��캯����
 *   class MyException extends Exception{
 *   	MyException(Strinng message){
 *   	super(message);
 *   }
 *   }
 *   
 *�Զ����쳣�ǰ���java ����Զ���˼�룬�������г��ֵ�����������з�װ��
 * --------------
 * 
 * �쳣�ĺô���
 *    1.��������з�װ��
 *    2.���������̴�������⴦����������롣�����Ķ�
 *    
 * �쳣�Ĵ���ԭ��
 *   1.������ʽ�����֣�try ���� throws
 *   2.���õ��׳��쳣�Ĺ���ʱ���׳��������ʹ�������
 *     һ��try ��Ӧ��� catch
 *   3.���catch , �����catch�ŵ������档  
 *   4.catch����Ҫ��������ԵĴ�����ʽ����Ҫ�򵥵Ķ���printStrackTrace , �������䡣
 *     Ҳ��Ҫ��д��
 *     �����񵽵��쳣�������ܴ�������ʱ�����Լ�����catch ���׳���
 *     try{
 *     		throw new AException();
 *     }catch(AException e){
 *        throw e;
 *     }
 *     
 *     ������쳣�������ˣ����������ڸù��ܵ��쳣��
 *     ���Խ��쳣ת�������׳��͸ù�����ص��쳣��
 *     
 *     �����쳣���Դ���������Ҫ���쳣������ͱ�������ص������ṩ��ȥ��
 *     ��������֪������������Ҳ���Խ������쳣������ת���µ��쳣��
 *     try{
 *     		throw new AException();
 *     }catch(AException e){
 *     		throw new BException();
 *     }
 *     
 * �쳣��ע�����
 * 	  ���Ӹ��า��ʱ��
 *   1.	�����׳����쳣�����Ǹ����쳣����������Ӽ���
 *   2.���������߽ӿ�û���쳣�׳�ʱ�����า�ǳ����쳣��ֻ��try�����ס�
 *   
 *   
 * */
public class DemoException04 {

}