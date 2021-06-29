package com.bk.th;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleCallCache {

	public static void main(String[] args) throws InterruptedException,ExecutionException {

		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<String> st1 = executor.submit(() -> "hi");
		Future<String> st2 = executor.submit(() -> "hello");
		
		String str = st1.get() + st2.get();
		
		System.out.println(str);
		
		
	}

}
