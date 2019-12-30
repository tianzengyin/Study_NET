package system12306;

public class Ticket {
	
	private String start;//起始站名
	private String end;//终点站名
	private Float price;//价钱
	public Ticket(){}
	public Ticket(String start, String end, Float price) {
		super();
		this.start = start;
		this.end = end;
		this.price = price;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [start=" + start + ", end=" + end + ", price=" + price
				+ "]";
	}
	
	
}
