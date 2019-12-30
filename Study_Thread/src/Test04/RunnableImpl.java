package Test04;

	

public class RunnableImpl implements Runnable{
	private static int ticket =100;
	//创建一个锁对象
	Object obj = new Object();
	@Override
	public void run() {
		System.out.println(this);
		while(true){
			payTicket();
		}
	}
	//同步方法
/*	public  synchronized void payTicket(){
		synchronized(this){
		if(ticket>0){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票" );
		ticket--;
	}
	}
	}*/
	//静态同步方法
	public static synchronized void payTicket(){
		synchronized(RunnableImpl.class){
		if(ticket>0){
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
