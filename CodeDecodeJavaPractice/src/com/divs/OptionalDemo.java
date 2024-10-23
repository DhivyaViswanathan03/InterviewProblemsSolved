package com.divs;

import java.util.Optional;

public class OptionalDemo {

	
	public static void main(String[] args) {
		String[] str = new String[10];  
		Optional<String> value = Optional.ofNullable(str[5]);
//		if(value.isPresent()) {
//			System.out.println("exists");
//		}else {
//			System.out.println("not exists");
//		}
		
		value.ifPresentOrElse((n)->System.out.println(n), ()->System.out.println("Sorry not available"));

	}

}
