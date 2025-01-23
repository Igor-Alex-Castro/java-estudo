package entities;

import java.util.Date;

import entities.enums.OrderSatatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderSatatus status;
	
	public Order() {
		
	}

	
	public Order(Integer id, Date moment, OrderSatatus status) {
		super();
		this.id = id;
		this.moment = moment;
		this.status = status;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderSatatus getStatus() {
		return status;
	}

	public void setStatus(OrderSatatus status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
}
