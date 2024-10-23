package com.divs.multithreading;

public class OddEvenInSeqJavaTechie implements Runnable{
	 static int count = 1;
	    Object object;

	    public OddEvenInSeqJavaTechie(Object object) {
	        this.object = object;
	    }

	    @Override
	    public void run() {

	        while (count <= 10) {
	            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
	                synchronized (object) {
	                    System.out.println("Thread Name : " + Thread.currentThread().getName() + " value :" + count);
	                    count++;
	                    try {
	                        object.wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
	            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
	                synchronized (object) {
	                    System.out.println("Thread Name : " + Thread.currentThread().getName() + " value :" + count);
	                    count++;
	                    object.notify();
	                }
	            }

	        }

	    }

	    public static void main(String[] args) {
	        Object lock=new Object();
	        Runnable r1=new OddEvenInSeqJavaTechie(lock);
	        Runnable r2=new OddEvenInSeqJavaTechie(lock);
	        new Thread(r1, "even").start();
	        new Thread(r2, "odd").start();
	    }
}
