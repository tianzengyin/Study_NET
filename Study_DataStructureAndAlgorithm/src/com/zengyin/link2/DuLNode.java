package com.zengyin.link2;

public class DuLNode {
	 Object data;//������
	 DuLNode prior;//���ָ��ǰ������ָ����
	 DuLNode next;//���ָ������ڵ��ָ����
	public DuLNode(){
		this(null);
	}
	public DuLNode(Object data){
		this.data = data;
		this.prior = null;
		this.next =  null;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public DuLNode getPrior() {
		return prior;
	}
	public void setPrior(DuLNode prior) {
		this.prior = prior;
	}
	public DuLNode getNext() {
		return next;
	}
	public void setNext(DuLNode next) {
		this.next = next;
	}
	
	
}
