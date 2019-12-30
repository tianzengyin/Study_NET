package producer;

public class Testmain {

	public static void main(String[] args) {
		Warehouse houst = new Warehouse();
		Producer p1 = new Producer(houst);
		//设置线程的优先级别1-10
		p1.setPriority(10);
		Consumer c1 = new Consumer(houst);
		Consumer c2 = new Consumer(houst);
		p1.start();
		c1.start(); 
		c2.start(); 
	}

}
