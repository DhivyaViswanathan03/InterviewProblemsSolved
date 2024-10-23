package com.divs.realtimeproblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindLongestSubString {

	public static void main(String[] args) {
		
		String s="javaconceptoftheday";
		System.out.println(longestSubString(s));

	}

	private static String longestSubString(String s) {
		char[] characterArr=s.toCharArray();
		Map<Character,Integer> charMap=new LinkedHashMap();
		int longestStringLen=0;
		String longestString = "";
		for(int i=0;i<characterArr.length;i++) {
			char ch=characterArr[i];
			if(!charMap.containsKey(ch)) {
				charMap.put(ch, i);
			}else {
				i=charMap.get(ch);
				charMap.clear();
			}
			if(charMap.size()>longestStringLen) {
				longestStringLen=charMap.size();
				longestString=charMap.keySet().toString();
			}
		}
		return longestString;
		
	}

}
