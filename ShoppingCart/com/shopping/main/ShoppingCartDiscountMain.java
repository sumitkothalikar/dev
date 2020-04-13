package com.shopping.main;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.shopping.service.Customer;
import com.shopping.service.DiscountCalculator;

public class ShoppingCartDiscountMain {

	private static final String NO = "no";

	public static void main(String args[]) {
		
		    // Change the customer type and purchase amount to test this program.
            String customerType="Regular";
		    int purchaseAmount= 15000;
		    
			Customer customer = new Customer();
			customer.setCustomerType(customerType);
			customer.setPurchaseAmount(purchaseAmount);
			

			DiscountCalculator discCal = new DiscountCalculator();
			System.out.println();
			System.out.println(discCal.calculateBillAmount(customer));
	
	}

}