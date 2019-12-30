package Window;

import java.util.concurrent.locks.ReentrantLock;

class Winsdow implements Runnable {
	
	private int ticket = 100;
	//1.实例化ReentrantLock
	private ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {
		while(true){
			//synchronized (this) {
			
			
			try {
				//2.调用锁定lock方法
				lock.lock();
					if (ticket > 0) {
						try {
							Thread.sleep(100);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ "--->" + ticket);
						ticket--;
					} else {
						break;
					}
			} finally  {
				//3.释放锁
				lock.unlock();
			}
			//}
		}
	}

}
public class LockTest{
	public static void main(String[] args) {
		Winsdow w1 = new Winsdow();
		Thread  t1 = new Thread(w1);
		Thread  t2 = new Thread(w1);
		Thread  t3 = new Thread(w1);
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
	
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}