package com.jobready.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		// Set number of allowed threads to run at the same time
		ExecutorService executor = Executors.newFixedThreadPool(3); // recycle threads

		Runnable processor1 = new MessageProcessor(2);
		executor.execute(processor1);

		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);

		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);
		
		executor.shutdown(); // rejects any new task from being submitted. gracefully shutsdown the service
		// executor.shutdownNow(); // shutdown immediately
		
		//executor.awaitTermination(10, TimeUnit.SECONDS);
		
		while( !executor.isTerminated()) {
			
		}
		
		System.out.println("Submitted all tasks.");
		
	}
}
