package com.bk.th;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThRe {

	public static void main(String[] args) throws ExecutionException, InterruptedException {

		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<String> th1 = executor.submit(() -> "hi");
		
		Future<String> th2 = executor.submit(new Callable(){
			public String call() throws Exception {
				return " second";
			}
		});
		
		System.out.println(th1.get() + th2.get());
		
		executor.shutdown();
		
	}

}
