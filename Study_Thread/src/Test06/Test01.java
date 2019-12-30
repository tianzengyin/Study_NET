package Test06;

public class Test01 {

	public static void main(String[] args) {
		try {
			Object lock=new Object();
			MyThread1 t1=new MyThread1(lock);
			t1.start();//执行wait的线程
			Thread.sleep(3000);
			MyThread2 t2=new MyThread2(lock);
			t2.start();//执行notify的线程
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
