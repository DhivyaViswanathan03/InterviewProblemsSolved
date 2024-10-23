package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsinTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1= {5,8,3,1};
		int[] arr2= {1,3,3,7,9};
		
		List<Integer> result=Arrays.stream(arr1).filter(value->Arrays.stream(arr2)
				.anyMatch(value2 ->value2==value)).boxed().collect(Collectors.toList());
		System.out.println(result);
		
		

	}

}
