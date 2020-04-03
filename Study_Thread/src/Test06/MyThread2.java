package Test06;

public class MyThread2 extends Thread {
	private Object lock;
	public MyThread2(Object lock){
		super();
		this.lock=lock;
	}
	@Override
	public void run(){
		synchronized (lock) {
			System.out.println("开始           notify  time="+System.currentTimeMillis());
			lock.notify();//当前执行的线程唤醒另一个线程并进入就绪状态
			try {
				System.out.println("5秒后");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("结束            notify  time="+System.currentTimeMillis());
		}
	}

}
