package com.divs.codingpractice;

import java.util.stream.IntStream;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String str = "DOCTOR";
		String str1=str;
		
		boolean result = IntStream.range(0, str.length()/2)
		.allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
		if(result) {
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}

	}

}
