package AccountTest;

public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	//存钱
	public /*synchronized*/ void deposit(double amt){
		if(amt>0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			balance += amt;
			System.out.println(Thread.currentThread().getName()+"存钱成功,余额为: "+balance);
		}
	}
}
