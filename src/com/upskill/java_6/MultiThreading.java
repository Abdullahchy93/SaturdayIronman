package com.upskill.java_6;

public class MultiThreading {
	/* Multithreading is a java feature that allows concurrent execution of two or more parts of a program.
	 *  
	 *  Threads can be created by using two mechanisms
	 *  
	 *  	1. Extending the Thread class
	  	    2. Implementing the Runnable Interface */

	public static void main(String[] args) {
		int i = 5;
		for(int n = 0; n < i; n++){
		MultiThreadingThread obj = new MultiThreadingThread();
		obj.start();
		
		Thread obj2 = new Thread(new MultiThreadingRunnable());
		obj2.start();
		
		
		}

    }
	
}


