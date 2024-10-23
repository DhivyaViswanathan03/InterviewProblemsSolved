package com.divs.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinLenSubArraySolution {

	public static void main(String[] args) {
		/**
		 * Input: target = 7, nums = [2,3,1,2,4,3]
           Output: 2
           Explanation: The subarray [4,3] has the minimal length under the problem constraint.
		 */
		int nums[] = {2,3,1,2,4,3};
		int target = 7;
		  
		System.out.println(minSubArrayLen(target,nums));

	}

	private static int minSubArrayLen(int target, int[] nums) {
		List<Integer> numsList=Arrays.stream(nums).boxed()
		.sorted(Collections.reverseOrder())
		.collect(Collectors.toList());
		int minLength=0;
		int index=0;
		int sum=0;
		while(index<numsList.size()) {
			minLength++;
			sum=sum+numsList.get(index);
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
