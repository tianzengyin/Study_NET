package AccountTest;

import java.util.concurrent.locks.ReentrantLock;

public class Coustomer extends Thread{
	private Account acct;
	private static ReentrantLock lock = new ReentrantLock();
	public Coustomer(Account acct){
		this.acct = acct;
	}
	@Override
	public void run() {
		
		for(int i = 0;i<3;i++){
			
			try {
				lock.lock();
				acct.deposit(1000);
			} finally  {
				lock.unlock();
			}
		}
	}
	
}
