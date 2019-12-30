package com.zengyin.collection;
/**
 * ��ϰ:�Լ�ʵ��ArrayList
 * ����ʵ��
 */
public class SxtArrayList /*implements list*/{
		private Object[] elementDate;//�������һ�������Ԫ�س�ΪelementDate
		
		private int size;
		
		public int size(){
			return size;
		}
		
		public boolean isEmpty(){
			return size == 0;
		}
		
		public SxtArrayList(){
			this(10);
		}
		public SxtArrayList(int initialCapacity){
			if(initialCapacity < 0){
				try{
					throw new Exception();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
			elementDate = new Object[initialCapacity];
		}
		
		public void add(Object obj){
			//�������ݺ����ݿ���
			if(size == elementDate.length){
				//����һ���µ�����newArray,����Ϊsize*2+1
				Object newArray = new Object[size*2+1];
				//��elementDate���Ԫ�شӵ�0����ʼ������newArray��0��λ��,����ΪelementDate.length
				System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
				/*for(int i = 0;i<elementDate.length;i++){
					newArray[i] = elementDate[i];
				}*/
				elementDate = (Object[]) newArray;
				
			}
			elementDate[size++] = obj;
		}
		public Object get(int index){
		/*	if(index < 0 || index >= size){
				try{
					throw new Exception();
				}catch (Exception e){
					e.printStackTrace();
				}
			}*/
			rangeCheck(index);
			return elementDate[index];
		}
		public void remove(int index){
			/*if(index < 0 || index >= size){
				try{
					throw new Exception();
				}catch (Exception e){
					e.printStackTrace();
				}
			}*/
			rangeCheck(index);
			int numMoved = size - index - 1;
			if(numMoved >0){
				System.arraycopy(elementDate , index +1 , elementDate , 
						index, numMoved);
				elementDate[--size] = null;
			}
		}
		public void remove(Object obj){
			for (int index = 0; index < size; index++)
                if (obj.equals(elementDate[index])) {
                    fastRemove(index);
                    
                }
			
		}
		public Object set(int index , Object obj){
			rangeCheck(index);
			Object oldValue = elementDate[index];
	        elementDate[index] = obj;
	        return oldValue;
		}
		public void add(int index , Object obj){
			ensureCapacity();//��������
			rangeCheck(index);
			System.arraycopy(elementDate, index, elementDate, index + 1,
                    size - index);
			elementDate[index] = obj;
			size++;
		}
		 private void fastRemove(int index) {
			 rangeCheck( index);
		        int numMoved = size - index - 1;
		        if (numMoved > 0)
		            System.arraycopy(elementDate, index+1, elementDate, index,
		                             numMoved);
		        elementDate[--size] = null; // clear to let GC do its work
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
		private void ensureCapacity(){
			if(size == elementDate.length){
				//����һ���µ�����newArray,����Ϊsize*2+1
				Object newArray = new Object[size*2+1];
				//��elementDate���Ԫ�شӵ�0����ʼ������newArray��0��λ��,����ΪelementDate.length
				System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
				/*for(int i = 0;i<elementDate.length;i++){
					newArray[i] = elementDate[i];
				}*/
				elementDate = (Object[]) newArray;
				
			}
		}
		public static void main(String[] args){
			SxtArrayList list = new SxtArrayList(3);
			list.add("333");
			list.add("444");
			list.add("444");
			list.add("55");
			list.add("66");
			list.add("777");
			System.out.println(list.size());
			list.remove(new String("444"));
			for(int i = 0 ; i< list.size;i++){
				System.out.println(list.get(i));
			}
			System.out.println(list.size());
		
		}
		
}
