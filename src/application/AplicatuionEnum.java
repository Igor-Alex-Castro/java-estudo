package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderSatatus;

public class AplicatuionEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(), OrderSatatus.PEDDINT_PAYMENT);
		
		System.out.println(order);
		
		OrderSatatus os1 = OrderSatatus.DELIVERED;
		OrderSatatus os2 = OrderSatatus.valueOf("DELIVERED");
		//Conversão de String enum velueOf;
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
