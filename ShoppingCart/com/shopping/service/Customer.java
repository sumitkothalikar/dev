package com.shopping.service;
/**
 * 
 */

/**
 * @author Sumit Kothalikar
 *
 */
public class Customer {

	String customerType;
	int purchaseAmount;

	public Customer() {
		super();
	}

	public Customer(String customerType, int purchaseAmount) {
		super();
		this.customerType = customerType;
		this.purchaseAmount = purchaseAmount;
	}

	public String getCustomerType() {
		return customerType;
	}

	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

}
