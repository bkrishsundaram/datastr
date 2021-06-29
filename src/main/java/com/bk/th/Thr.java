package com.bk.th;

public class Thr {

	public static void main(String[] args) {

		  The t = new The();
		  t.start();
		  
		
	}

}


class The extends Thread {
	public void run() {
		try {
			for(int i=0;i<3;i++) {
				System.out.println(i);
				Thread.sleep(400);
			}
		}catch(InterruptedException ie) {
			
		}
	}
}