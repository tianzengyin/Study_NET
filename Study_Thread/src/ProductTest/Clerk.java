package ProductTest;

public class Clerk {
	private int productCount =0;
    //生产产品
	public synchronized void produceProduct() {
		
		if(productCount<20){
			productCount++;
			System.out.println(Thread.currentThread().getName()
					           +":开始生产第"+productCount+"个产品");
			notify();
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	//消费产品
	public synchronized void consumerProduct() {
		//notify();
		if(productCount>0){
			
			System.out.println(Thread.currentThread().getName()+":开始消费第"+productCount+"产品");
			productCount--;
			notify();
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
