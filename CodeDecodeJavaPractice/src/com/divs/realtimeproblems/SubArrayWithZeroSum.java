package com.divs.realtimeproblems;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] nums = { 4, 2, -3, 1, 6 };
//		int[] nums= {-3, 2, 3, 1, 6};
//		int[] nums={4, 2, 0, 1, 6};
		System.out.println(subArrayExistsUsingForLoop(nums));
		System.out.println(subArrayExistsUsingMap(nums));

	}
	private static boolean subArrayExistsUsingForLoop(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum=nums[i];
			if (sum == 0)
				return true;
			for (int j = i + 1; j < nums.length; j++) {
                sum=sum+nums[j];
                if(sum==0)
                	return true;
			}
		}
		return false;

	}
	private static boolean subArrayExistsUsingMap(int[] arr) {
		 Set<Integer> hs = new HashSet<Integer>();
		 
	        // Initialize sum of elements
	        int sum = 0;
	 
	        // Traverse through the given array
	        for (int i = 0; i < arr.length; i++) {
	            // Add current element to sum
	            sum += arr[i];
	 
	            // Return true in following cases
	            // a) Current element is 0
	            // b) sum of elements from 0 to i is 0
	            // c) sum is already present in hash set
	            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
	                return true;
	 
	            // Add sum to hash set
	            hs.add(sum);
	            System.out.println(hs);
	        }
	 
	        // We reach here only when there is
	        // no subarray with 0 sum
		return false;
		
	}
}
