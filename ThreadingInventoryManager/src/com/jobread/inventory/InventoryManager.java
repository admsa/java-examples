package com.jobread.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	List<Product> soldProductsList = new CopyOnWriteArrayList<>();
	List<Product> purchasedProductsList = new ArrayList<>();
	
	public void populateSoldProducts() throws InterruptedException {
		for(int i = 0; i < 1000; i++) {
			
			Product prod = new Product(i, "test_product_" + i);
			
			soldProductsList.add(prod);
			System.out.println("ADDED: " + prod);
			
			Thread.sleep(10);
			
		}
	}
	
	public void displaySoldProducts() throws InterruptedException {
		for (Product product : soldProductsList) {
			System.out.println("PRINTING THE SOLD: " + product);
			Thread.sleep(10);
		}
	}
	
}
