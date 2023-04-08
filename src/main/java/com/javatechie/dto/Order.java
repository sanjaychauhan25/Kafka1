package com.javatechie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order {

    private int id;
    private String name;
    private int qty;
    private double price;
    private String transactionId;
    private Date orderPlacedDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}
	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + ", transactionId="
				+ transactionId + ", orderPlacedDate=" + orderPlacedDate + "]";
	}
    
    
}
