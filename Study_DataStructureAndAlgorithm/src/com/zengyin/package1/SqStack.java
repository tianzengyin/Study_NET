package com.zengyin.package1;

public class SqStack implements IStack {

	private Object[] stackElem;//��������
	private int top;//ָ��ջ��
	public SqStack(){}
	public SqStack(int maxSize){
		top = 0;
		stackElem = new Object[maxSize];
		
	}
	/**ջ�ÿ�
	 * */
	public void clear(){
		top = 0;
	}
	/*
	 * �ж��Ƿ�Ϊ��
	 * */
	public boolean isEmpty(){
		if( top == 0)
			return true;
		return false;
		
	}
	public int length(){
		return top;
	}
	//ȡջ��Ԫ��
	public Object peek(){
		if(!isEmpty()){
			return stackElem[top-1];
		}else
			return null;
	}
	//��ջ
	public  void push(Object x) throws Exception{
		if(top == stackElem.length){
			throw new Exception("ջ����");
		}else
			stackElem[top++] = x;
	}
	//��ջ
	public Object pop(){
		if(isEmpty()){
			return null;
		}else
			return stackElem[--top];
	}
	public void display(){
		for(int i = top - 1 ; i > 0 ; i++){
			System.out.println(stackElem[i]+" ");
		}
	}
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		SqStack sq = new SqStack(30);
		for(int i=0;i<20;i++){
			
			sq.push(new SqStack());
		}
		
		sq.display();
	}
	
	/*int[] arr = {2,3,4};
	String arr1 = arr.toString();*/
	
}
