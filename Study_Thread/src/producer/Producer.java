package producer;



public class Producer extends Thread{
	private Warehouse warehouse;
	public Producer(Warehouse warehouse){
		this.warehouse = warehouse;
	}
	
	//生产者的run方法 一直向仓库内添加元素
	@Override
	public void run() {
		while(true){
			synchronized (warehouse) {
				warehouse.add();
			}
			
			System.out.println(Thread.currentThread().getName()+"生产者存入了一件货物");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
}
