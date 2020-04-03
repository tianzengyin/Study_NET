package Test06;

public class MyThread1 extends Thread{
	private Object lock;
	public MyThread1(Object lock){
		this.lock = lock;
	}
	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("开始           wait  time="+System.currentTimeMillis());
				lock.wait();//当前线程释放锁并进入等待状态
				System.out.println("结束            wait  time="+System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
}
