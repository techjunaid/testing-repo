package com.multithreading;

public class ThreadPriority implements Runnable {
	

	
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
		
    	  Runnable r = new ThreadPriority();
    	  Thread t = new Thread(r);
    	  Thread t1 = new Thread(r);
    	  
    	  t.setPriority(Thread.MAX_PRIORITY);
    	  t.start();
    	  
	       t1.setPriority(Thread.MIN_PRIORITY);
	       t1.start();
	        
	        
	        
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

	
		
	


