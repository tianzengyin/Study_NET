package cn.edu.tju.rico.sort;

import java.util.Arrays;

/**
 * Title: ���������е�ð������ ��һ��������ָ�����Ż����ð������������n-1�αȽ�
 * Description:��ΪԽ���Ԫ�ػᾭ�ɽ�������"��"�����еĶ���(���λ��)������������ȷ�����������Գ�Ϊð������
 * ʱ�临�Ӷȣ��������O(n)��ƽ������O(n^2)���������O(n^2) 
 * �ռ临�Ӷȣ�O(1) 
 * �� �� �ԣ��ȶ�
 * �ڲ�����(���������������Ԫ����ȫ���ڴ�)
 * 
 * @author rico
 * @created 2017��5��20�� ����10:40:00
 */
public class BubbleSort {

	  
	/**     
	 * @description ����ð������(������n-1�αȽ�)
	 * @author rico         
	 */
	public static int[] bubbleSort(int[] target) {
		int n = target.length;
		if (target != null && n != 1) {
			// �����Ҫ����n-1�ɣ�ÿһ�˽��Ƚ�С��Ԫ���Ƶ�ǰ�棬�Ƚϴ��Ԫ����Ȼ���𽥳���������ˣ������ð��
			for (int i = 0; i < n-1; i++) {      
				for (int j = n-1; j > i; j--) {
					if(target[j] <target[j-1]){
						int temp = target[j];
						target[j] = target[j-1];
						target[j-1] = temp;
					}
				}
				System.out.println(Arrays.toString(target));
			}
		}
		return target;
	}
	
	/**     
	 * @description �Ż�ð������
	 * @author rico         
	 */
	public static int[] optimizeBubbleSort(int[] target) {
		int n = target.length;
		if (target != null && n != 1) {
			// �����Ҫ����n-1�ɣ�ÿһ�˽��Ƚ�С��Ԫ���Ƶ�ǰ�棬�Ƚϴ��Ԫ����Ȼ���𽥳���������ˣ������ð��
			for (int i = 0; i < n-1; i++) {      
				boolean exchange = false;
				for (int j = n-1; j > i; j--) {
					if(target[j] < target[j-1]){
						int temp = target[j];
						target[j] = target[j-1];
						target[j-1] = temp;
						exchange = true;
					}
				}
				System.out.println(Arrays.toString(target));
				if (!exchange){
					return target;
				}
			}
		}
		return target;
	}
	public static void main(String[] args){
		int[] arr = new int[]{1,3,12,45,48,85,156,23,78,456};
		optimizeBubbleSort(arr);
	}
}
