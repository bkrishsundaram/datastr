package com.bk.th;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallDemo {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<Integer> future = null;
		
		future = executor.submit(new CallDemo1());
		
		System.out.println(future.get());
		
        executor.shutdown();
	}

}


class CallDemo1 implements Callable<Integer> {
	
	 public Integer call() {
		 return 1000;
	 }
	
}
