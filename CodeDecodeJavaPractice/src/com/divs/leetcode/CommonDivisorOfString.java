package com.divs.leetcode;

public class CommonDivisorOfString {

	public static void main(String[] args) {
		/**
		 * Input: str1 = "ABCABC", str2 = "ABC" Output: "ABC"
		 */

		String str1 = "ABCABC";
		String str2 = "ABC";
		System.out.println(gcdOfStrings(str1, str2));
	}

	private static String gcdOfStrings(String str1, String str2) {
		if(str2.length()>str1.length())
return gcdOfStrings(str2,str1);
if(str1.equals(str2))
	return str1;
if(str1.startsWith(str2))
	return gcdOfStrings (str1.substring(str2.length()), str2);
			return "";
	}

//	private static String gcdOfStrings(String str1, String str2) {
//		if(str2.length()>str1.length()) 
//			return gcdOfStrings(str2,str1); 
//		if(str1.equals(str2))
//			return str1;
//		if(str1.startsWith(str2))
//			return gcdOfStrings(str1.substring(str2.length()),str2);
//		
//		return "";
//		
//	}

}
