package com.upskill.java_6;

public class MultiThreadingRunnable implements Runnable{
	
	//public class MultiThreadingThread extends Thread{
		
		public void run(){
			try{
				System.out.println("Thread Number #" + Thread.currentThread().getId() + " is running");
			}catch(Exception e){
				System.out.println("Exception is caught");
				e.printStackTrace();
				
			}
			
		}
		

	}

	