package com.divs.corejavainterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		 int[] numbers = {9, 6, 4, 5, 7, 0, 1};
		 
		 Set<Integer> set =new HashSet();
		 
		 Arrays.sort(numbers);
		 
		 for(int i=numbers[0];i<=numbers[numbers.length-1];i++) {
			 set.add(i);
		 }
		 for(int i=0;i<numbers.length;i++) {
			 set.remove(numbers[i]);
		 }
		 for(int a:set) {
			 System.out.print(a);
		 }

	}

}
