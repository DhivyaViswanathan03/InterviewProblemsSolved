package com.divs.realtimeproblems;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr= {2,5,1,9,11};
		int n=arr.length;
		int d=2,k = 0;
		int[] temp=new int[arr.length];
		for(int i=2;i<n;i++) {
			temp[k]=arr[i];
			k++;
		}
		for(int i=0;i<d;i++) {
			temp[k]=arr[i];
			k++;
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		int[] arr1= {2,5,1,9,11};
		//output==> 5,1,9,11,2 ==>1,9,11,2,5
		int p=1;
		while(p<=d) {
			int last=arr1[0];
			for(int i=0;i<n-1;i++) {
				arr1[i]=arr1[i+1];
			}
			arr1[n-1]=last;
			p++;
		}
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2= {2,5,1,9,11};
		//output ==>11,2,5,1,9 ==> 9,11,2,5,1
		int q=1;
		while(q<=d) {
			int last=arr2[arr2.length-1];
			System.out.println("last is:"+last);
			for(int i=arr2.length-2;i>=0;i--) {
				arr2[i+1]=arr2[i];
			}
			arr2[0]=last;
			q++;
		}
		System.out.println(Arrays.toString(arr2));
		
		
		
	}

}
