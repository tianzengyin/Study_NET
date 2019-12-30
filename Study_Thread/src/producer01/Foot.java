package producer01;

public class Foot {
	private String name;
	private String descript;
	private boolean flag = false;
	public Foot(){}
	public Foot(String name, String descript) {
		this.name = name;
		this.descript = descript;
	}
	
	//生产方法
	public synchronized void set(String name,String descript){
		if(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.setName(name);
		this.setDescript(descript);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"已生产产品");
		flag = true;
		this.notify();
	}
	//消费方法
	public synchronized void get(){
		if(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.print(Thread.currentThread().getName()+"已消费产品:");
		System.out.println(this.getName()+"--->"+this.getDescript());
		flag= false;
		this.notify();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	
}
