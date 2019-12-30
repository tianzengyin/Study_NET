package study_Collection02;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 自己实现一个ArrayList
 * **/
public class myArrayList {
	
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = new Object[10];

	private Object[] elementData;
	
	private int size;
	
	public myArrayList(){
		this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	public myArrayList(int initialCapacity){
		if(initialCapacity > 0){
			elementData = new Object[initialCapacity];
		}
		if(initialCapacity == 0){
			elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		}
		if(initialCapacity < 0 ){
			throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
		}
			
		
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public Object get(int index){
		rangeCheck(index);
		return elementData[index];
	}
	
	public Object remove(int index){
		rangeCheck(index);
		Object oldvalue = elementData[index];
		fastRemove(index);
		return oldvalue;
	}
	public boolean remove(Object obj){
		
		if(obj==null){
			for(int index = 0;index<size;index++){
				if(elementData.equals(null)){
					fastRemove(index);
				}
				return true;
			}
		}else{
			for(int index =0;index<size;index++){
				if(elementData[index].equals(obj)){
					fastRemove(index);
				}
				return true;
			}
		}
		return false;
	}
	private void fastRemove(int index){
		
		int numMoved = size - index - 1;
		System.arraycopy(elementData, index+1, elementData, index, numMoved);
		elementData[--size] = null;
		
	}
	public void add(Object obj){
		if(size==elementData.length){//数组扩容
			Object[] newArray = new Object[size*2+1];
			
			//System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			for(int i =0;i<elementData.length;i++){
				newArray[i]= elementData[i];
			}
			elementData = newArray;
		}
		elementData[size++] = obj;
	}
	
	public void set(int index,Object obj){
		 rangeCheck(index);
		 elementData[index] = obj;
	}
	
	
	
	
	public static void main(String[] args) {
		//ArrayList 
		myArrayList maArralist = new myArrayList();
		maArralist.add(333);
		maArralist.add(333);
		maArralist.add(333);
		maArralist.add(333);
		
		sop(maArralist.size);
		sop(maArralist.get(5));
		
	}
	private void rangeCheck(int index){
		if(index<0 || index>=size){
			try {
				throw new Exception();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}

}
