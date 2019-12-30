package cn.edu.tju.rico.stack;

import java.util.LinkedList;

  
/**        
 * Title: ������LinkedListʵ��ջ   
 * Description: 
 * @author rico       
 * @created 2017��4��6�� ����8:25:21    
 */      
public class LinkedListStack<E> {
	
	// ֧��List
	private LinkedList<E> stack;
	
	// ���캯��
	public LinkedListStack(){
		stack = new LinkedList<E>();
	}
	
	// �Ƿ�Ϊ��
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	// ѹջ
	public void push(E data){
		stack.addFirst(data);
	}
	
	//��ջ
	public E pop() throws Exception{
		if(stack.isEmpty()){
			throw new Exception("ջ����...");
		}
		
		return stack.pop();
	}
	
	@Override
	public String toString() {
		return stack.toString();
	}

	public static void main(String[] args) throws Exception {
		LinkedListStack<String> stack = new LinkedListStack<String>();
		stack.push("Rico");
		stack.push("TJU");
		stack.push("Livia");
		stack.push("NEU");

		System.out.println(stack);

		stack.pop();
		System.out.println(stack);
	}
}
