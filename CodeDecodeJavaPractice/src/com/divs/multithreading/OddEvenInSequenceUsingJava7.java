package com.divs.multithreading;

public class OddEvenInSequenceUsingJava7  implements Runnable{

static int count=1;

	@Override
	public void run() {
		while(count<=10) {
			
				if(count%2==0 && Thread.currentThread().getName().equals("Even")) {
					synchronized (this) {
					System.out.println("Thread name: "+Thread.currentThread().getName()
							+" value:"+count);
					count++;
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			
				if(count%2!=0 && Thread.currentThread().getName().equals("Odd")) {
					synchronized (this) {
					System.out.println("Thread name: "+Thread.currentThread().getName()
							+" value:"+count);
					count++;
					notify();
				}
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Runnable r1=new OddEvenInSequenceUsingJava7();
		Thread t1=new Thread(r1,"Even");
		t1.start();
		
		Thread t2=new Thread(r1,"Odd");
		t2.start();

	}

}
