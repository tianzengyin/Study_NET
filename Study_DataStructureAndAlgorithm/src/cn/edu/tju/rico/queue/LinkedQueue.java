package cn.edu.tju.rico.queue;

  
/**        
 * Title: ��������Ķ���ʵ��  
 * Description: ��ͷ���(ͷ��㲻�洢ֵ,��Ӳ���O(1))��βָ��(ɾ������O(1))
 * @author rico       
 * @created 2017��5��19�� ����8:49:34    
 */      
    
public class LinkedQueue<E> {

	private Node<E> head;  // ͷ���
	private Node<E> rear;   // βָ��
	private int size;   // ���д�С
	
	public LinkedQueue(){
		head = rear = new Node<E>(null);
	}
	  
	/**     
	 * @description ���Ԫ�ص���β
	 * @author rico       
	 * @created 2017��5��19�� ����8:52:20     
	 * @param data     
	 */
	public void put(E data){
		Node<E> node = new Node<E>(data);
		rear.next = node;
		rear = node;
		size ++;
	}
	  
	/**     
	 * @description ɾ����ͷ�����ض�ͷԪ�ص�ֵ
	 * @author rico       
	 * @created 2017��5��19�� ����8:52:24     
	 * @return     
	 */
	public E pop(){
		if(!isEmpty()){
			E e = null;
			Node<E> temp = head.next;
			head.next = temp.next;
			e = temp.data;
			
			temp.data = null;
			temp.next = null;
			size--;
			return e;		
		}
		return null;
	}
	  
	/**     
	 * @description ���ض�ͷԪ�ص�ֵ
	 * @author rico       
	 * @created 2017��5��19�� ����8:52:28     
	 * @return     
	 */
	public E peek() {
		if (!isEmpty()) {
			return head.next.data;
		}
		return null;
	}
	
	  
	/**     
	 * @description �����Ƿ�Ϊ��
	 * @author rico       
	 * @created 2017��5��19�� ����8:52:33     
	 * @return     
	 */
	public boolean isEmpty(){
		return size == 0;
	}
	
	  
	/**     
	 * @description ���д�С
	 * @author rico       
	 * @created 2017��5��19�� ����8:52:35     
	 * @return     
	 */
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node<E> cur = head.next;
		StringBuilder sb = new StringBuilder();
		while(cur != null){
			sb.append(cur.data).append(" ");
			cur = cur.next;
		}
		return sb.toString();
	}
}
