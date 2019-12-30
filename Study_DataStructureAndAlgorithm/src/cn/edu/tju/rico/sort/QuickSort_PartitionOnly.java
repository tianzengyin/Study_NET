package cn.edu.tju.rico.sort;

import java.util.Arrays;

  
/**        
 * Title:��������ı���     
 * Description: �����ϲ��ϵ��þ�����ŵĻ����㷨
 * ʱ�临�Ӷȣ�O(n^2)
 * @author rico       
 * @created 2017��6��2�� ����9:10:43    
 */      
public class QuickSort_PartitionOnly {
	/**     
	 * @description �����������е�ÿ��Ԫ��Ϊ��׼����л��֣�
	 * ֱ����������Ԫ�ض�
	 * @author rico       
	 * @param array     
	 */
	public void quicksort(int[] array) {
		if (array != null && array.length != 0) {
			for (int i = 0; i < array.length; i++) {
				// �����ǿ��ŵĻ����㷨
				int base_index = 0; 
				int base = array[i];
				base_index = i;
				for (int j = i+1; j < array.length; j++) {
					if (array[j] <= base ) {
						base_index ++;
						if (base_index != j) {
							int temp = array[base_index];
							array[base_index] = array[j];
							array[j] = temp;
						}
					}
				}
				array[i] = array[base_index];
				array[base_index] = base;
				System.out.println(Arrays.toString(array));
			}
		}
	}
	
	public static void main(String[] args) {
//		int[] array = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		int[] array = { 1, 2, 3, 5, 0, 4, 9, 2, 6 };
		new QuickSort_PartitionOnly().quicksort(array);
	}
}
