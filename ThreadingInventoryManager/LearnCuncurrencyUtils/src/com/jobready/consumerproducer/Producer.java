package com.jobready.consumerproducer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> questionQueue;
	int questionNo;

	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {

				synchronized (this) {
					int nextQuestion = questionNo++;
					System.out.println("Got new question: " + nextQuestion);
					questionQueue.put(nextQuestion);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

//	private synchronized int getNextQuestion() {
//		
//		int nextQuestion = questionNo++;
//		System.out.println("Got new question: " + nextQuestion);
//		return nextQuestion;
//		
//	}
}
