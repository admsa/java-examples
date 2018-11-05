package com.jobread.client;

import com.jobread.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					manager.populateSoldProducts();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					manager.displaySoldProducts();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		inventoryTask.start();
		// inventoryTask.join();
		Thread.sleep(2000);
		displayTask.start();

	}

}
