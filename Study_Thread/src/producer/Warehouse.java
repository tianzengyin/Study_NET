package producer;

import java.util.ArrayList;

public class Warehouse {
	
	//仓库里的集合,存放元素
	private ArrayList<String> list  = new ArrayList<>();
	//向集合里添加元素的方法
	public void add(){
		if(list.size()<20){
		list.add("a");
		//notify();
		}else{
			//return ;
			try {
				notifyAll();
				wait();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	//从集合里获取元素
	public void get(){
		if(list.size()>0){
		list.remove(0);
		//notify();
			}else{
				//return;
				try {
					notifyAll();
					wait();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	
}
