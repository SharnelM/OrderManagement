package com.sharnel.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Order {
	
	@Id
	private int OrderId;
	private int UserId;
	private String CustomerName;
	private int ProductId; 
	private float Amount;
	private Date OrderDate;
	

	public Order() {
		
		
	}

	

	public Order(int OrderId,int UserId,String CustomerName ,int ProductId,float Amount,Date OrderDate) {
		super();
		this.OrderId = OrderId;
		this.UserId = UserId;
		this.CustomerName = CustomerName;
		this.ProductId = ProductId;
		this.Amount = Amount;
		this.OrderDate = OrderDate;
		
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int OrderId) {
		this.OrderId = OrderId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int UserId) {
		this.UserId = UserId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setContent(String CustomerName) {
		this.CustomerName = CustomerName;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int ProductId) {
		this.ProductId = ProductId;
	}
	
	public float getAmount() {
		return Amount;
	}

	public void setAmount(float Amount) {
		this.Amount = Amount;
	}
	
	public Date OrderDate() {
		return OrderDate;
	}

	public void setOrderDat(Date OrderDate) {
		this.OrderDate = OrderDate;
	}
	
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", UserId=" + UserId + ", CustomerName=" + CustomerName + ", ProductId=" + ProductId +", Amount ="+Amount+",OrderDate ="+OrderDate+"]";
	}
}
