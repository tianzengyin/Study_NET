package Test03;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class RunnableImpl implements Runnable{
	private int ticket =100;
	//创建一个锁对象
	Object obj = new Object();
	@Override
	public void run() {
		while(true){
			if(ticket>0){
				//同步代码块
				synchronized (obj) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票" );
					ticket--;
				
				}
					
				
			}
		}
	}
	

}
