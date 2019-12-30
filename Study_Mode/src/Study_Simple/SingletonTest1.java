package Study_Simple;
//����ģʽ:����ʽ
public class SingletonTest1 {

	public static void main(String[] args) {
		Bank bank1 = Bank.getBank();
		Bank bank2 = Bank.getBank();
		System.out.println(bank1 == bank2);//true
	}

}
class Bank{
	private Bank(){}
	private static Bank bank = new Bank();
	public static Bank getBank(){
		return bank;
	}
}

