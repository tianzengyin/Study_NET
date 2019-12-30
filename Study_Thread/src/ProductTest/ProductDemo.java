package ProductTest;

public class ProductDemo {
	
	public static void main(String[] args) {
		
		Clerk clerk = new Clerk();
		Producer p1 = new Producer(clerk);
		Consumer c1 = new Consumer(clerk);
		p1.setName("生产者1");
		c1.setName("消费者1");
		p1.start();
		c1.start();
	}
}
class Producer extends Thread {
	private Clerk clerk;

	public Producer(Clerk clerk) {
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":开始生产产品");
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			clerk.produceProduct();
		}
	}
	
}

class Consumer extends Thread{
	private Clerk clerk;

	public Consumer(Clerk clerk) {
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+":开始消费产品");
		while(true){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			clerk.consumerProduct();
		}
	}
	
}