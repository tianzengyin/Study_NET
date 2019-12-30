package producer01;

public class Producer implements Runnable{
     
	private Foot foot;
	
	public Producer(Foot foot) {
		this.foot = foot;
	}

	@Override
	public void run() {
		for(int i = 0;i<30;i++){
			if(i%2==0){
				foot.set("宫保鸡丁", "包子最爱吃的");
			}else{
				foot.set("木须肉", "大鹏最爱吃的");
			}
		}
		
		
	}

}
