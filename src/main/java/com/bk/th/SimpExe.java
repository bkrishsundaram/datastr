package com.bk.th;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExe {

	public static void main(String[] args) {
		
		CountDownLatch latch1 = new CountDownLatch(2);
		CountDownLatch latch2 = new CountDownLatch(2);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		
		service.execute(new MyThread1(latch1, "a"));
		service.execute(new MyThread1(latch2, "b"));
		
		service.shutdown();
		 
	}

}


class MyThread1 implements Runnable {
	String name;
	CountDownLatch latch;
	
	MyThread1(CountDownLatch latch, String n) {
		this.latch=latch;
		name = n;
	}
	
	 public void run() {
		 for(int i=0; i<2;i++) {
			 System.out.println(name+"   =  "+i);
		 }
		 latch.countDown();
	 }
	
}
