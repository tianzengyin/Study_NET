package Study_Simple;
//单例模式:饿汉式
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

