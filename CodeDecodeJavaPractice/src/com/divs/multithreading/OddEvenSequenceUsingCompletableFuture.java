package com.divs.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class OddEvenSequenceUsingCompletableFuture {

	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		IntStream.rangeClosed(1, 10).forEach(num->{
			CompletableFuture<Integer> oddFuture=CompletableFuture.completedFuture(num)
					.thenApplyAsync(x->{
				if(x%2!=0) {
					System.out.println("Thread name "+Thread.currentThread().getName()
							+" value is:"+x);
				}
				return num;
			},executorService)	;
			oddFuture.join();
			
			CompletableFuture<Integer> evenFuture=CompletableFuture.completedFuture(num)
					.thenApplyAsync(x->{
				if(x%2==0) {
					System.out.println("Thread name "+Thread.currentThread().getName()
							+" value is:"+x);
				}
				return num;
			},executorService)	;
			evenFuture.join();
		});

	}

}
