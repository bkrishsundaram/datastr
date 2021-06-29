package com.bk.th;

import java.util.concurrent.locks.ReentrantLock;

public class ReEntrant {

	public static void main(String[] args) {
     
		 ReentrantLock lk = new ReentrantLock();
		
		 new Thread(new ReEntrant1(lk, "A")).start();
		 new Thread(new ReEntrant1(lk, "B")).start();
		
	}

}


 class ReEntrant1 implements Runnable {
	 ReentrantLock lk;
	 String a;
	 
	 ReEntrant1(ReentrantLock lk, String a) {
		this.lk = lk;
		this.a = a;
	 }
	 
	 public void run() {
		 try{
		 System.out.println(a+ "  waitng to  unlock");
		 lk.lock();
		 System.out.println(a+ " locked ");
		 Thread.sleep(1000);
		 }catch(InterruptedException ex) {
			 
		 } finally {
			 lk.unlock();
		 }
	 }
	 
 }
