package com.divs.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinLengSunArray {

	public static void main(String[] args) {
//		int nums[] = { 2, 3, 1, 2, 4, 3 };
//		int target = 8;
//		int target = 4;
//		int[] nums = {1,4,4};
		 int target = 11;
		 int[] nums = {1,1,1,1,1,1,1,1};
		System.out.println(minSubArrayLen(target, nums));

	}

	private static int minSubArrayLen(int target, int[] nums) {
		int minLength=0;
		int index=0;
		int sum=0;
		List<Integer> numList=Arrays.stream(nums).boxed()
		.sorted(Collections.reverseOrder())
		.collect(Collectors.toList());
		while(index<numList.size()) {
			minLength++;
			sum=sum+numList.get(index);
			if(sum>=target) {
				return minLength;
			}
			index++;
		}
		if(sum<=target) {
			return minLength=0;
		}
		return minLength;
	}

}
