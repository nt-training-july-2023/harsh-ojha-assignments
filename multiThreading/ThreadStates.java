package com.multiThreading;

public class ThreadStates extends Thread{

	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread Started Exucution");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		ThreadStates obj = new ThreadStates();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread Created: "+obj.getState());
		
		Thread.sleep(1000);
		
		obj.start();
		System.out.println("Thread Started: "+obj.getState());
		
		Thread.sleep(1000);
		System.out.println("Thread Waiting: "+ obj.getState());
		
		Thread.sleep(3000);
		System.out.println("Thread Completed Execution: "+obj.getState());
		
		
		
		
		
	}
}
