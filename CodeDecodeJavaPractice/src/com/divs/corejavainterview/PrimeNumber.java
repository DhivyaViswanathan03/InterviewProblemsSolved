package com.divs.corejavainterview;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=2;
		int count = 0;
		while(count<10) {
			if(isPrime(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}

	}

	private static boolean isPrime(int num) {
		for(int i=2;i<num/2 ;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
