package com.bk.th;

public class Run {

	public static void main(String[] args) {
		 
		 
		
	Th	  th = new Th();
	Th	  th1 = new Th();
		
      Thread t = new Thread(th);
      t.start();
      
      Thread t1 = new Thread(th1);
      t1.start();
      
		
		
	}

}


class Th implements Runnable  {
	
	public void run() {
		try {
		for(int i = 0; i< 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		}catch(InterruptedException ex) {
			
		}
	}
}
