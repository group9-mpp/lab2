package prob2B;

public class OrderLine {
	
	private String linenum;
	private double price;
	private int quantity;
	private Order order;
	
	//package level
	 OrderLine(Order order,String linenum, double price, int quantity) {
		this.linenum = linenum;
		this.price = price;
		this.quantity = quantity;
		this.order = order;
	}
	public String getLinenum() {
		return linenum;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	public Order getOrder() {
		return order;
	}
	@Override
	public String toString() {
		return "\nOrderLine : linenum=" + linenum + ", price=" + price + ", quantity=" + quantity;
	}
	
	
	
	
}
