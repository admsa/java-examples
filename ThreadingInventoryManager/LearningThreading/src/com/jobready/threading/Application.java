package com.jobready.threading;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Starting thread 1");
		Task taskRunner1 = new Task("A");
		taskRunner1.start();
		
		System.out.println("Starting thread 2");
		
		Task taskRunner2 = new Task("B");
		taskRunner2.start();
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("number: " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		});
		
		thread1.start();
		
	}

}

class Task extends Thread {
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName("Thread-" + name);
		for (int i = 0; i < 10; i++) {
			System.out.println("number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
