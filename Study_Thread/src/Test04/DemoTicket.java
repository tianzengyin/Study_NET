package Test04;


public class DemoTicket {
	
	public static void main(String[] args) {
		RunnableImpl r1 = new RunnableImpl();
		System.out.println(r1);
		/*RunnableImpl r2 = new RunnableImpl();
		RunnableImpl r3 = new RunnableImpl();*/
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}
