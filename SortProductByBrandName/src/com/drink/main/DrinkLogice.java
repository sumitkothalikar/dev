package com.drink.main;

import java.util.*;

import com.drink.service.Drink;

public class DrinkLogice {
 
	List<Drink> listDrink = new ArrayList<Drink>();
	public void storeDrink(Drink drink) {
		listDrink.add(drink);
	}
	
	public List<Drink> getDrink(String brand){
		
		List<Drink> finalList = new ArrayList<Drink>();
		
		for(int i=0;i<listDrink.size();i++) {
			if(listDrink.get(i).getBrand().equalsIgnoreCase(brand)) {
				finalList.add(listDrink.get(i));
			}
		}
		
		return finalList;
	}
}
