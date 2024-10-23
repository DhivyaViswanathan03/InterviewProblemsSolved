package com.divs.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Nearest0Cell {

	public static void main(String[] args) {
//		int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
		int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
		int[][] result=updateMatrix(mat);
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] updateMatrix(int[][] mat) {
		int m=mat.length;
		int n=mat[0].length;
		Queue<int[]> queue=new LinkedList<int[]>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]==0) {
					queue.add(new int[] {i,j});
				}else {
					mat[i][j]=-1;
				}
			}
		}
		int[][] dirs= {{-1,0},{1,0},{0,-1},{0,1}};
		
		while(!queue.isEmpty()) {
			int[] cell=queue.poll();
			for(int[] d:dirs) {
				int r=cell[0]+d[0];
				int c=cell[1]+d[1];
				if(r<0 || c<0 || r>=m || c>=n || mat[r][c]!=-1)
					continue;
				queue.add(new int[] {r,c});
				mat[r][c]=mat[cell[0]][cell[1]]+1;
			}
		}
		return mat;
	}

}
