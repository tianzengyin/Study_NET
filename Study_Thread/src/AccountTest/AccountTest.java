package AccountTest;

public class AccountTest {
	public static void main(String[] args) {
		Account acct = new Account(0);
		Coustomer c1 = new Coustomer(acct);
		Coustomer c2 =new Coustomer(acct);
		
		c1.setName("甲");
		c2.setName("乙");
		c1.start();
		c2.start();
	}
}
