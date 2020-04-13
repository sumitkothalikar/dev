package com.drink.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.drink.main.DrinkLogice;
import com.drink.service.Drink;

class TestDrink {

	@Test
	void test() {
		Drink drink = new Drink("Coca-Cola","Fanta");
		Drink drink1 = new Drink("Coca-Cola","Fruity");
		Drink drink2 = new Drink("Coca-Cola","Limca");
		Drink drink3 = new Drink("Pepsi","Mirinda");
		Drink drink4 = new Drink("Pepsi","Sprit");

		DrinkLogice drl = new DrinkLogice();
		drl.storeDrink(drink);
		drl.storeDrink(drink1);
		drl.storeDrink(drink2);
		drl.storeDrink(drink3);
		drl.storeDrink(drink4);
		
		System.out.println(drl.getDrink("Pepsi"));
		
		
		fail("Not yet implemented");
	}

}
