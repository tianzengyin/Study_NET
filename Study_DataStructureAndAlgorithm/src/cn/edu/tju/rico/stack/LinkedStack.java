package cn.edu.tju.rico.stack;

import java.util.Comparator;

/**
 * Title: ��ǿ�Զ�����ʽջ [ͨ��ά��һ��ջ����֤��O(1)��ʱ�临�Ӷ���ջ�е���СԪ�� (�ռ任ȡʱ��)]
 * Description: ʹ�ö����ջ�ṹ�洢ջ�е���СԪ��
 * 				�����ǰ��ջ��Ԫ�ر�ԭ��ջ�е���Сֵ��С�����䱣�浽��Сֵջ�У����򣬲����κβ�����
 *              �����ǰ��ջ��Ԫ�������ǵ�ǰջ�е���Сֵ����ô����Сֵջ�еĸ���СֵҲһ�����������򣬲����κβ�����
 * @author rico
 * @created 2017��4��6�� ����7:52:34
 */
public class LinkedStack<E> {
	
	private Node<E> top; // ջ��Ԫ��
	private int size; // ��ʽջ�Ĵ�С
	
	/**  ��Сֵջ   (@author: rico) */    
	private LinkedStack<E> min;
	
	// ���캯��
	public LinkedStack(){
	}
	  
	/**     
	 * @description �ж�ջ�Ƿ�Ϊ��
	 * @author rico       
	 * @created 2017��5��14�� ����10:54:44     
	 * @return     
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**     
	 * @description ѹջ
	 * @author rico       
	 * @param data     
	 */
	public void push(E data) {
		Node<E> node = new Node<E>(data); 
		// �¼����Ԫ��ָ��ջ��Ԫ��
		node.next = top;
		top = node;
		size++;
	}
	
	/**     
	 * @description ѹջ����,ʹ����Сֵջ
	 * @author rico       
	 * @param data     
	 */
	public void push(E data, Comparator<? super E> c) {
		push(data);
		if(min == null){
			min = new LinkedStack<E>();
		}
		if(min.peek() == null){
			min.push(data);
		}else if(c.compare(this.peek().data, min.peek().data) < 0){
			min.push(data);
		}
	}

	/**     
	 * @description ������ɾ��ջ��Ԫ��
	 * @author rico       
	 * @return
	 * @throws Exception     
	 */
	public Node<E> pop(){
		if (isEmpty()) {
			return null;
		}

		Node<E> node = top;
		top = top.next;
		node.next = null;
		size--;
		return node;
	}
	
	/**     
	 * @description ������ɾ��ջ��Ԫ��,ʹ����Сֵջ
	 * @author rico       
	 * @return
	 * @throws Exception     
	 */
	public Node<E> pop(Comparator<? super E> c){
		Node<E> temp = this.pop();
		if(temp != null && min.peek() != null){
			if(c.compare(temp.data, min.peek().data) == 0){
				min.pop();
			}
		}
		return temp;
	}
	
	/**     
	 * @description ����ջ��Ԫ��(��ִ��ɾ������)
	 * @author rico       
	 * @return     
	 */
	public Node<E> peek(){
		if (isEmpty()) {
			return null;
		}
		return top;
	}

	/**     
	 * @description ��ȡ��ǰջ�е���Сֵ 
	 * @author rico       
	 * @return     
	 */
	public Node<E> min() {
		if(min.peek() == null){
			return null;
		}else{
			return min.peek();
		}
	}
	
	/**     
	 * @description ��ӡջ
	 * @author rico       
	 */
	public void print() {
		Node<E> index = top;
		while (index != null) {
			System.out.print(index.data + " ");
			index = index.next;
		}
		System.out.println();
	}
	  
	
	
	/**     
	 * @description ����ջ�Ĵ�С
	 * @author rico       
	 * @return     
	 */
	public int size(){
		return size;
	}

	public LinkedStack<E> getMin() {
		return min;
	}

	public void setMin(LinkedStack<E> min) {
		this.min = min;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node<E> index = top;
		StringBuilder sb = new StringBuilder();
		while (index != null) {
			sb.append(index.data).append(" ");
			index = index.next;
		}
		return sb.toString();
	}
}
