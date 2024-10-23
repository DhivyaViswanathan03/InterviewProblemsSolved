package com.divs.codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddEvenNumbers {

	public static void main(String[] args) {
    List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
    List<Integer> evenList=listOfIntegers.stream().filter(a->a%2==0).collect(Collectors.toList());
    System.out.println(evenList);
    
    Map<Boolean, List<Integer>> oddEvenResult = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
    System.out.println(oddEvenResult);
    
    Set<Entry<Boolean, List<Integer>>> value = oddEvenResult.entrySet();
    for(Map.Entry<Boolean, List<Integer>> entry:value) {
    	if(entry.getKey()) {
    		System.out.println("Even numbers");
    		System.out.println(entry.getValue());
    		
    	}else {
    		
    		System.out.println("Odd numbers");
    		System.out.println(entry.getValue());
    	}
    }
    
	}

}
