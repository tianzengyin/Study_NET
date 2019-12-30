package Test01;

public class TestMain {

	public static void main(String[] args) {
		
		//创建一个线程对象
			RunningMan r1 = new RunningMan("田增印");
			RunningMan r2 = new RunningMan("王金镖");
			RunningMan r3 = new RunningMan("吴松清");
			
		//2.调用start方法 让线程进入就绪状态
			Thread t1 = new Thread(r1);
			t1.start();
			Thread t2 = new Thread(r2);
			t2.start();
			Thread t3 = new Thread(r3);
			t3.start();
			
			
			/*r1.start();
			r2.start();
			r3.start();*/
		
	}

}
