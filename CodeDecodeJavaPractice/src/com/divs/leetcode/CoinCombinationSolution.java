package com.divs.leetcode;

public class CoinCombinationSolution {

	public static void main(String[] args) {
		int[] coins = {2};
		int amount=3;
		
//		int amount = 5;
//		int[] coins = {1,2,5};
		
//		int[] coins = {10};
//		int amount=10;
		System.out.println(change(amount,coins));
	}

	private static int change(int amount, int[] coins) {
		int[] dp=new int[amount+1];
		dp[0]=1;
		for(int coin:coins) {
			for(int i=coin;i<=amount;i++) {
				dp[i]=dp[i]+dp[i-coin];
			}
		}
		return dp[amount];
	}
}
