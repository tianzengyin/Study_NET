	package com.zengyin.link;
	
	public class Node {
		//�ڵ�������
	 private int data;
	 //ָ����һ���ڵ�
	 Node next;
	 
	 public Node(int data){
		 this.data = data;
	 }
	//�ֶ�׷�ӽڵ�
	 public void append(Node node){
		 this.next = node;
		
	 }
	 //�Զ�׷�ӽڵ�
	 public Node append_2(Node node){
		 //���嵱ǰ�ڵ�
		 Node currentNode = this;
		 //ѭ�������
		 while(true){
			 //ȡ����һ���ڵ�
			 Node nextNode = currentNode.next;
			 //���û����һ���ڵ�
			 if(nextNode == null){
				 break;
			 }
			 //������ǰ�ڵ�
			 currentNode = nextNode; 
		 }
		currentNode.next = node;
		return this;
	 }
	 
	 
	 public Node next(){
		 return this.next;
	 }
	 
	 public int getData(){
		 return this.data;
	 }
	public void removeNext(){
		//ȡ������һ���ڵ�
		Node newNext = next.next ;
		//������һ���ڵ�����Ϊ��ǰ�ڵ����һ���ڵ�
		this.next = newNext;
		
	}
	//��ʾ���нڵ���Ϣ
	public void show(){
		Node currentNode = this;
		while(true){
			System.out.println(currentNode.data);
			//ȡ����һ���ڵ�
			currentNode = currentNode.next;
			if(currentNode.next == null){
				break;
			}
		}
	}
	}
