package com.zengyin.collection;

public class SxtLinkedList {
		private Node first;
		private Node last;
		private int size;
		public void add(Object obj){
			Node n = new Node();
			if(first == null){
				n.setPrevious(null);
				n.setObj(obj);
				n.setNext(null);
				first = n;
				last = n;
			}
			else{
				//Node n = new Node();
				n.setPrevious(last);
				n.setObj(obj);
				n.setNext(null);
				last.setNext(n);
				last = n;
			}
			size++;
		}
		public int size(){
			return size;
		}
		public Object get(int index){
			rangeCheck(index);
			/*Node temp = null;
			if( (first != null)){
				 temp = first;
				for(int i = 0;i<index;i++){
					temp = temp.next; 
				}
			}
			return temp.obj;*/
			Node temp = node(index);
			if(temp!= null){
				return temp.obj;
			}
			return null;
		}
		public Node node(int index){
			Node temp = null;
				if( (first != null))
				{
					        if(index < (size >> 1))
				     {  
						      temp = first;
							 for(int i = 0;i<index;i++)
							 {
								temp = temp.next;
					         }
				     }
					      else
				     {
						    temp = last;
						    for(int i = size - 1;i>index;i--)
						   {
							temp = temp.previous;
					       }
					 
				      }
				  }
				return temp;
			}
		public void remove(int index){
			/*Node temp = null;
			if( (first != null)){
				 temp = first;
				for(int i = 0;i<index;i++){
					temp = temp.next; 
				}
			}*/
			rangeCheck(index);
			Node temp = node(index);
			if(temp != null){
				Node up = temp.previous;
				Node down = temp.next;
				up.next = down;
				
			}
			size--;
		}
		public void add(int index, Object obj ){
			Node temp = node(index);
			Node newNode = new Node();
			newNode.obj =obj;
			if(temp!=null){
				Node up = temp.previous;
				up.next = newNode;
				newNode.previous = up;
				newNode.next = temp;
				temp.previous= newNode;
				size++;
			}
		}
		private void rangeCheck(int index){
			if(index < 0 || index >= size){
				try{
					throw new Exception();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args){
			SxtLinkedList list = new SxtLinkedList();
			list.add("4556");
			list.add("aaa");
			list.add("ccc");
			System.out.println(list.size());
			//list.remove(0);
			list.add(1, "bbbb");
			System.out.println(list.get(1));
			System.out.println(list.size());
		}
}

