package prob2B;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private Date orderDate;
	private int orderNum;
	private List<OrderLine> orderLines; // or  = new ArrayList<OrderLine>();
	
	
	public Order(Date orderDate, int orderNum, String linenum, double price, int quantity) {
		this.orderDate = orderDate;
		this.orderNum = orderNum;
		this.orderLines = new ArrayList<OrderLine>();
		orderLines.add(new OrderLine(this,linenum, price, quantity));
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void addOrderLine(String linenum, double price, int quantity) {
		 orderLines.add(new OrderLine(this,linenum, price, quantity));
	}
	@Override
	public String toString() {
		return "Order : orderDate=" + orderDate + ", orderNum=" + orderNum + ", \norderLines=" + orderLines + "\n";
	}
	
	
	

}
