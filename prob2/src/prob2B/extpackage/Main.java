package prob2B.extpackage;

import java.util.Date;

import prob2B.Order;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order(new Date(), 1, "g1", 100.0, 2);
		order.addOrderLine("g2", 200.0, 3);
		order.addOrderLine("g3", 300.94, 4);		
		order.addOrderLine("g4", 400.7, 9);
		
		System.out.println(order);

	}

}
