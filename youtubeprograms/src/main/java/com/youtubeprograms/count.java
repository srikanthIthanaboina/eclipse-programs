package com.youtubeprograms;

public class count {
	
	int count;
	
	public void increment() {
		count++;
	}
	
	
	public static void main(String[] args) throws Exception {
		count c = new count();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i =1;i<1000;i++) {
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i =1;i<1000;i++) {
					c.increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

}
