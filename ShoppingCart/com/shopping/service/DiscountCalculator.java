package com.shopping.service;

import com.shopping.constants.CustomerTypeConstants;

/**
 * @author Sumit Kothalikar
 * 
 * Service /Business Logice Layer
 * Actual Business Logic will be here
 */
public class DiscountCalculator {

	public String calculateBillAmount(Customer customer) {
		String finalBillAmount = "";
		String customerType = customer.getCustomerType();
		int purchaseAmount = customer.getPurchaseAmount();

		double billAmnt = calculateBillAmount(customerType, purchaseAmount);
		if (billAmnt == 0) {
			finalBillAmount = "Please Enter Valid Customer Type : ";
		} else if (billAmnt == -1) {
			finalBillAmount = "Please Enter Valid Bill Amount : ";
		} else {
			finalBillAmount = "Final Bill for " + customer.getCustomerType() + " customer is : " + billAmnt;
		}

		return finalBillAmount;
	}

	// Method to calculate exact bill amount
	// Handle exceptions

	private double calculateBillAmount(String customerType, int purchaseAmount) {

		double result = purchaseAmount;
		if (purchaseAmount < 0) {
			return -1;
		}
		switch (customerType.toLowerCase()) {
		case CustomerTypeConstants.PREMIUM:
			if (purchaseAmount <= 4000) {
				result = result - discountBracket(0, 4000, 10, purchaseAmount);
			} else if (purchaseAmount <= 8000) {
				result = result - discountBracket(0, 4000, 10, purchaseAmount);
				result = result - discountBracket(4000, 8000, 15, purchaseAmount);
			} else if (purchaseAmount <= 12000) {
				result = result - discountBracket(0, 4000, 10, purchaseAmount);
				result = result - discountBracket(4000, 8000, 15, purchaseAmount);
				result = result - discountBracket(8000, 12000, 20, purchaseAmount);
			} else if (purchaseAmount > 12000) {
				result = result - discountBracket(0, 4000, 10, purchaseAmount);
				result = result - discountBracket(4000, 8000, 15, purchaseAmount);
				result = result - discountBracket(8000, 12000, 20, purchaseAmount);
				result = result - discountBracket(12000, Integer.MAX_VALUE, 30, purchaseAmount);
			}
			break;
		case CustomerTypeConstants.REGULAR:
			if (purchaseAmount <= 5000) {
				result = result - discountBracket(0, 5000, 0, purchaseAmount);
			} else if (purchaseAmount <= 10000) {
				result = result - discountBracket(0, 5000, 0, purchaseAmount);
				result = result - discountBracket(5000, 10000, 10, purchaseAmount);
			} else if (purchaseAmount > 10000) {
				result = result - discountBracket(0, 5000, 0, purchaseAmount);
				result = result - discountBracket(5000, 10000, 10, purchaseAmount);
				result = result - discountBracket(10000, Integer.MAX_VALUE, 20, purchaseAmount);
			}
			break;
		default:
			return 0;
		}

		return result;
	}

	// Method to calculate Discount
	private double discountBracket(int low, int high, double perc, int totlIncome) {
		double discount = 0.0;
		int calcDisc = 0;
		if (totlIncome > high)
			calcDisc = high;
		else
			calcDisc = totlIncome;
		discount = ((double) calcDisc - (double) low) * perc / 100;
		return discount;
	}
}
