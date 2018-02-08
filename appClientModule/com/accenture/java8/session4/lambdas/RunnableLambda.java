package com.accenture.java8.session4.lambdas;

public class RunnableLambda {

	public RunnableLambda() {
	}
	
    public static void main(String args[]) {
    	// Lambda is calling run method implicitly
    	Runnable task3 = () -> { System.out.println("Task #3 is running"); };
    	 
    	// start the thread
    	new Thread(task3).start();
    }
}