package Test05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

	

public class RunnableImpl implements Runnable{
	private static int ticket =100;
	//创建一个锁对象
	//Object obj = new Object();
	//在成员位置创建一个ReentrantLock对象
	Lock  l = new ReentrantLock();
	@Override
	public void run() {
		System.out.println(this);
		while(true){
			//在可能出现安全问题的代码前,调用Lock接口中方法获取锁
			l.lock();
			if(ticket>0){
				try {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票" );
					ticket--;
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}finally{
					//在可能出现安全问题的代码后,调用Lock接口中方法释放锁
					l.unlock();
				}
				
				
		}
		}
			
	}
	/*@Override
	public void run() {
		System.out.println(this);
		while(true){
			//在可能出现安全问题的代码前,调用Lock接口中方法获取锁
			l.lock();
			if(ticket>0){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票" );
				ticket--;
				//在可能出现安全问题的代码后,调用Lock接口中方法释放锁
				l.unlock();
		}
		}
			
	}*/
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
