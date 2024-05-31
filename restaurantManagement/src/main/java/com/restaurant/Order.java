package com.restaurant;

import java.sql.Date;
//import java.util.List;

public class Order {

	private int id;
	private int customerId;
	private int tableId;
	private Date orderDate;
//	private List<Integer> menuItemIds;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
//	public List<Integer> getMenuItemIds() {
//		return menuItemIds;
//	}
//	public void setMenuItemIds(List<Integer> menuItemIds) {
//		this.menuItemIds = menuItemIds;
//	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", tableId=" + tableId + ", orderDate=" + orderDate
				+ "]";
	}
	
}
