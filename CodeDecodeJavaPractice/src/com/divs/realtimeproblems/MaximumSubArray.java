package com.divs.realtimeproblems;

/**
 * Input: arr = {-2,-3,4,-1,-2,1,5,-3} Output: 7 Explanation: The subarray
 * {4,-1, -2, 1, 5} has the largest sum 7.
 * 
 * Input: arr = {2} Output: 2 Explanation: The subarray {2} has the largest sum
 * 1.
 */
public class MaximumSubArray {

	public static void main(String[] args) {
//		int[] nums = {-2,-3,4,-1,-2,1,5,-3};
//		int[] nums= {2};
		int[] nums={5,4,1,7,8};
		maximumContiguousArray(nums);
	}

	private static void maximumContiguousArray(int[] nums) {
		int n=nums.length;
		int sum,max=0;
		if(nums.length==1) {
			max=nums[0];
		}
		for(int i=0;i<n;i++) {
			sum=nums[i];
			for(int j=i+1;j<n;j++) {
				sum=sum+nums[j];
				max=Math.max(sum, max);
			}
		}
		System.out.println(max);
		
	}

}
