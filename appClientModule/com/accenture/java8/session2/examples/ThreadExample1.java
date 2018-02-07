package com.accenture.java8.session2.examples;

import java.util.concurrent.TimeUnit;

public class ThreadExample1 {

	public ThreadExample1() {
	}
	public static void main(String[] args) {
		Runnable runnable = () -> {
		    try {
		        String name = Thread.currentThread().getName();
		        System.out.println("Foo " + name);
		        TimeUnit.SECONDS.sleep(1);
		        System.out.println("Bar " + name);
		    }
		    catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};

		Thread thread = new Thread(runnable);
		thread.start();
	}
}
