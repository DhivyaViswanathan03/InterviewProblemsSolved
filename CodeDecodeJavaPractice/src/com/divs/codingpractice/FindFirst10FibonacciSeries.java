package com.divs.codingpractice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10FibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		int firstNum=0,secondNum=1,nextNum;
		System.out.print(firstNum+" "+secondNum+" ");
		for(int i=0;i<n;i++) {
			nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
			System.out.print(nextNum+" ");
		}
		System.out.println();
		
		//Using JAVA 8
		
//		String result=Stream.iterate(new int[] {0,1},t->new int[] {t[1],t[0]+t[1]})
//		.limit(10)
//		.map(t->t[0])
//		.map(String::valueOf)
//		.collect(Collectors.joining(","));
//		System.out.println(result);
		
//		System.out.println(Stream.iterate(new int[] {0,1},t->new int[] {t[1],t[0]+t[1]})
//		.limit(10)
//		.map(t->t[0])
//		.collect(Collectors.toList()));
		
		Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]}).limit(10)
		.map(t->t[0]).forEach(System.out::println);
		Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]}).limit(10)
		.map(t->t[0]).forEach(System.out::println);
		

	}

}
