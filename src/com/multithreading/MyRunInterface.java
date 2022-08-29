package com.multithreading;

public class MyRunInterface implements Runnable {
	

	
	@Override
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
		
    	  Runnable r = new MyRunInterface();
    	  Thread t = new Thread(r);
	        
	        
	        t.start();
	        
	        try {
				t.join();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
	        
	        System.out.println("Main Thread");
	        
	        for (int i=6; i<10;i++) {
	        	System.out.println(i);
	        }

	}
	}

	
		
	


