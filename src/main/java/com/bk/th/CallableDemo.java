package com.bk.th;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExecutorService executor = null;
		try {
         executor = Executors.newFixedThreadPool(2);
        
        Future<String> st1 = executor.submit(new FirstString());
        Future<String> st2 = executor.submit(new SecondString());
        
        String s1 = st1.get();
        String s2 = st2.get();
        
        System.out.println(s1+s2);
        
		}catch(ExecutionException ex) {
			
		}catch(InterruptedException ex) {
			
		}
        finally {
        	executor.shutdown();
        }
		
		
	}

}



class FirstString implements Callable<String> {
	
	public String call() {
		return "first";
	}
}

class SecondString implements Callable<String> {
	
	public String call() {
		return "second";
	}
}