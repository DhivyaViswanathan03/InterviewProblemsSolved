package com.divs.leetcode;

import java.util.Arrays;

public class IncreasingPathGridSolution {
	
	public static void main(String[] args) {
		
int[][] grid = {{1,1},{3,4}};
		
//		int[][] grid= {{1},{2}};
		System.out.println(new IncreasingPathGridSolution().countPaths(grid));

	}
	int mod=(int) (1e9+7);
	public int countPaths(int[][] grid) {
		int m=grid.length;
		int n=grid[0].length;
		int[][] dp=new int[m][n];
		for(int[] arr:dp) {
			Arrays.fill(arr, -1);
		}
		int paths=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				paths=(paths+solve(grid,i,j,-1,dp))%mod;
			}
		}
		return paths;
	}

	private int solve(int[][] grid, int i, int j, int k, int[][] dp) {
		if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]<=k)
			return 0;
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int left=solve(grid,i,j-1,grid[i][j],dp);
		int right=solve(grid,i,j+1,grid[i][j],dp);
		int up=solve(grid,i-1,j,grid[i][j],dp);
		int down=solve(grid,i+1,j,grid[i][j],dp);
		
		return dp[i][j]=(1+left+right+up+down)%mod;
		
	}

}
