package com.divs.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Nearest0CellSolution {

	public static void main(String[] args) {
		int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
		int[][] result = updateMatrix(mat);
		
		int m=mat.length;
		int n=mat[0].length;
		
		List<List<Integer>> matt=new ArrayList();
		matt.add(List.of(0,0,0));
		matt.add(List.of(0,1,0));
		matt.add(List.of(0,0,0));
	
		
		List<List<Integer>> finalResult=updateMatrixx(matt);
		for(List<Integer> list:finalResult) {
			for(Integer i:list) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		}

	private static List<List<Integer>> updateMatrixx(List<List<Integer>> matt) {
		int m=matt.size();
		int n=matt.get(0).size();
		Queue<int[]> queue=new LinkedList<int[]>();
		List<Integer> rowList=new ArrayList<Integer>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matt.get(i).get(j)==0) {
					queue.offer(new int[] {i,j});
					rowList.add(0);
				}else {
				rowList.add(-1);
				}
			}
		}
		
		int[][] dirs= {{-1,0},{1,0},{0,-1},{0,1}};
		
		while(!queue.isEmpty()) {
			int[] cell=queue.poll();
			int row=cell[0];
			int col=cell[1];
			for(int[] d:dirs) {
				int r=cell[0]+d[0];
				int c=cell[1]+d[1];
				if(r<0 || r>=m || c<0 || c>=n || matt.get(r).get(c)!=-1)
					continue;
				queue.offer(new int[] {r,c});
				matt.get(r).set(c, matt.get(row).get(col)+1);
			}
		}
		return matt;
	}

	private static int[][] updateMatrix(int[][] matrix) {
		int m=matrix.length;
		int n=matrix[0].length;
		Queue<int[]> queue=new LinkedList<int[]>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j]==0) {
					queue.offer(new int[] {i,j});
				}else {
					matrix[i][j]=-1;
				}
			}
		}
		
		int [][] dirs= {{-1,0},{1,0},{0,-1},{0,1}};
		while(!queue.isEmpty()) {
			int[] cell=queue.poll();
			for(int[] d:dirs) {
				int r=cell[0]+d[0];
		        int c=cell[1]+d[1];
		        if(r<0 || r>=m || c<0 || c>=n || matrix[r][c]!=-1)
		        	continue;
		        queue.offer(new int[] {r,c});
		        matrix[r][c]=matrix[cell[0]][cell[1]]+1;
			}
			
		}
		return matrix;
	}

	}


