package com.codewithajay.producer_cosumer;

import java.util.PriorityQueue;

public class QueueList {
	
	private PriorityQueue<Integer> queue;

	public QueueList(PriorityQueue<Integer> queue) {
		this.queue = queue;
	}

	 public PriorityQueue<Integer> getQueue() {
		return queue;
	}
}
