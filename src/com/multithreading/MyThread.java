package com.multithreading;

public class MyThread extends Thread{
	
	
	public void run() {
		for (int i =0; i<5;i++) {
			if(i==3) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}
	
    
	public static void main(String[] args) {
	        Thread t = new MyThread();
	        
	        //behave as inheritance
	        //t.run();
	        
	        // starts the life cycle of thread
	        t.start();
	        
	        System.out.println("Main Thread");
	        
	        for (int i=6; i<10;i++) {
	        	System.out.println(i);
	        }

	}

}
