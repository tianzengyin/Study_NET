package producer01;

public class Consumer implements Runnable{
	private Foot foot;
	
	public Consumer(Foot foot) {
		this.foot = foot;
	}

	@Override
	public void run() {
		for(int i=0;i<30;i++){
			foot.get();
		}
		
	}
	
}
