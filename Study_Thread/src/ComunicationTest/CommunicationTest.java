package ComunicationTest;
/**
 * 线程通信:使用两个线程拓印1-100 . 线程1 线程2 交替打印
 * 涉及到的三个方法:
 * 		wait():一旦执行此方法,当前线程就进入阻塞状态,并释放同步监视器(锁).
 *      notify():一旦执行此方法,就会唤醒被wait的一个线程.如果有多个线程被wait,就唤醒优先级最高的那个.
 *      notifyAll():一旦执行此方法,就会唤醒所有被wait的线程.
 *      
 *      
 * */
public class CommunicationTest {
	public static void main(String[] args) {
		Number number = new Number();
		Thread t1 = new Thread(number);
		Thread t2 = new Thread(number);
		t1.setName("线程1");
		t2.setName("线程2");
		t1.start();
		t2.start();
	}
}
class Number implements Runnable{
	private int number = 1;
	@Override
	public void run() {
		while(true){
			synchronized (this) {
				notifyAll();
				if (number <= 100) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "--->" + number);
					number++;
					try {
						wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				} else {
					break;
				}
			}
		}
	}
	
}