package system12306;

public class Window extends  Thread{
	private String windowName;//窗口名字
	public Window(String windowName){
		this.windowName = windowName;
	}
	public void run(){
		this.sellTicket();
	}
	public void sellTicket(){
		while(true){
			System12306 sys = System12306.getInstance();
			Ticket ticket = sys.getTicket();
			if(ticket == null){
				System.out.println("当前"+windowName+"窗口已买完");
				break;
			}
			System.out.println("从"+windowName+"售出"+ticket);
		}
	}
}
