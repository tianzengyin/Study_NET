package cn.edu.tju.rico.test;

import cn.edu.tju.rico.heap.MinHeap;

public class MinHeapTest {
	public static void main(String[] args) {
		
		int[] arr = {53, 17, 78, 9, 45, 65, 87, 23};
		MinHeap heap = new MinHeap(arr,20);
		System.out.println("�ѣ�");
		heap.printMinHeap(0);
		System.out.println("\n---------------------------\n");
		System.out.println("����в���Ԫ��7�󣬶ѱ�Ϊ��");
		heap.insert(7);
		heap.printMinHeap(0);
		System.out.println("\n---------------------------\n");
		System.out.println("ɾ������ĩβԪ�أ��ѱ�Ϊ��");
		heap.remove();
		heap.printMinHeap(0);
		System.out.println("\n---------------------------\n");
		System.out.println("��������Ϊ��");
		heap.sort();
	}
}
