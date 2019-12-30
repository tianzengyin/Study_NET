package producer01;

public class MainTest {

	public static void main(String[] args) {
		Foot f = new Foot();
		Producer p = new Producer(f);
		Consumer c = new Consumer(f);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}
