package Study_Simple;
//单例模式:懒汉式
public class SingletonTest2 {

	public static void main(String[] args) {
		Order order1 = Order.getOrder();
		Order order2 = Order.getOrder();
		System.out.println(order1==order2);//true
	}

}
class Order{
	private Order(){}
	private static Order order = null;
	public static Order getOrder(){
		if(order==null){
			order = new Order();
		}
		return order;
	}
}