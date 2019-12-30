package study_Collection02;

import java.util.LinkedList;
import java.util.List;




public class myLinkedList {

	private Node first;
	private Node last;
	
	private int size;
	public int size(){
		return size;
	}
	public myLinkedList(){
		
	}
	
	public void add(Object obj){
		
		 final Node l = last;
	     final Node newNode = new Node(l, obj, null);
	        last = newNode;
	        if (l == null)
	            first = newNode;
	        else
	            l.next = newNode;
	        size++;
		
		/*if(first==null){
			Node n = new Node(null,obj,null);
			first = n;
			last = n;
		}else{
			Node l = new Node(last,obj,null);
			last = l;
		}
		size++;*/
	}
	public void add(int index,Object obj){
		checkElementIndex(index);
		Node x = first;
		for(int i =0;i<index;i++){
			x= x.next;			
		}	
		Node n = new Node(x.previous,obj,x);
		x.previous.next= n;
		n.next=x;
		
		/*n.previous= x.previous;
		n.next= x;
		x.previous= n;*/
		
		//更新next链接
		//n.next=x.previous;
		//x.next = n;
		//更新pre链接
		//n.next.previous = n;
		//n.previous = x;
		size++;
		
	}
	
	public void remove(int index){
		checkElementIndex(index);
		Node x = first;
		for(int i =0;i<=index;i++){
			x= x.next;			
		}
		x.previous.previous.next=x;
		x.previous= x.previous.previous;
		//x.previous.previous.next=x;
		size--;
	}
	public Object get(int index){
		checkElementIndex(index);
		if (index < (size >> 1)){
		Node x = first;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x.obj;
        }else{
        	Node x = last;
        	for(int i = size-1;i>index;i--){
        		x = x.previous;
        	}
        	return x.obj;
        }
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		myLinkedList l = new myLinkedList();
		l.add("aaa");
		l.add("bbb");
		l.add("ccc");
		l.add("ddd");
		l.add("eee");
		l.add("fff");
		
		l.add(2, "444");
		l.remove(2);
		
		
		System.out.println(l.size());
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
	private void checkElementIndex(int index){
		if(index<0 || index>=size){
			try {
				throw new Exception();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}



















class Node{
	Node previous;
	Object obj;
	Node next;
	Node(){
		
	}
	
	Node(Node previous,Object obj,Node next){
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
		
	}
	
	
}
