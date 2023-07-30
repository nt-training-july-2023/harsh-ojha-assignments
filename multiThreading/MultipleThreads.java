package com.multiThreading;

public class MultipleThreads {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {
			

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		});
		thread1.start();
		thread2.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

}
