package producer;

public class Consumer extends Thread{
	private Warehouse warehouse;
	public Consumer(Warehouse warehouse){
		this.warehouse = warehouse;
	}
	
	//消费者的方法 一直从仓库内获取元素
	@Override
	public void run() {
		
		while(true){
			synchronized (warehouse) {
				warehouse.get();
			}
			
			System.out.println(Thread.currentThread().getName()+"消费者拿走了一件货物");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
