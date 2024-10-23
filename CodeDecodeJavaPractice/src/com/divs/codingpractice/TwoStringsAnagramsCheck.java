package com.divs.codingpractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoStringsAnagramsCheck {

	public static void main(String[] args) {
		String s1 = "Racedar";
        String s2 = "CarRace";
        String str1=Arrays.stream(s1.split("")).map(a->a.toUpperCase()).sorted().collect(Collectors.joining());
        String str2=Arrays.stream(s2.split("")).map(a->a.toUpperCase()).sorted().collect(Collectors.joining());
        if(str1.equals(str2)) {
        	System.out.println("Anagram");
        }
        else {
        	System.out.println("Not Anagram");
        }
	}

}
