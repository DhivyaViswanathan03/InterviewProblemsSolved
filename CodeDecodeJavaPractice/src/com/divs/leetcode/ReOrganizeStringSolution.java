package com.divs.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ReOrganizeStringSolution {

	public static void main(String[] args) {
		String s = "aab";
		System.out.println(reOrganize(s));
	}

	private static String reOrganize(String s) {
		int[] hash=new int[26];
		for(char c:s.toCharArray()) {
			hash[c-'a']++;
		}
		Comparator<Integer> comp=(a,b)->hash[b]-hash[a];
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		for(int i=0;i<26;i++) {
			if(hash[i]>(s.length()+1)/2) return "";
			if(hash[i]>0) pq.add(i);
		}
		StringBuilder sb=new StringBuilder();
		while(pq.size()>=2) {
			int id1=pq.poll();
			int id2=pq.poll();
			char c1=(char) (id1+'a');
			char c2=(char) (id2+'a');
			sb.append(c1);
			sb.append(c2);
			hash[id1]--;
			hash[id2]--;
			if(hash[id1]>0)pq.add(id1);
			if(hash[id2]>0)pq.add(id2);
		}
		if(pq.size()!=0) {
			int id1=pq.poll();
			char c1=(char) (id1+'a');
			sb.append(c1);
		}
		return sb.toString();
		
	}

}
