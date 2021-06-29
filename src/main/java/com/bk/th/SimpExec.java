package com.bk.th;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(1);
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		 executor.execute(new SimpExec1(latch));
		 try{
			 latch.await();
		 }catch(InterruptedException Ex){
			 
		 }  	   
		 
		 executor.shutdown();
		 

	}

}



class SimpExec1 implements Runnable{
	
	 CountDownLatch latch;
	 
	 public SimpExec1(CountDownLatch latch) {
		 this.latch = latch;
	 }
	
	public void run() {
		System.out.println("Thread");
		latch.countDown();
	}
}
