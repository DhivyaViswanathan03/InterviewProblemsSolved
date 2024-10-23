package com.divs.corejavainterview;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Parent{    
	  void msg(){  
	   System.out.println("parent method");  
	  }    
	}   

public class TestApp extends Parent{ 
	
	      @Override
		  void msg(){    
		   System.out.println("child method");    
		  }   
		 
		  public static void main(String args[]) {    
		  Parent p = new TestApp();    
		  p.msg(); 
			  
//			System.out.println(10 + 20 + "Javatpoint");   
//			System.out.println("Javatpoint" + 10 + 20);
//			     
//			String[] strArray={"hello", "aaaaa", "java", "aa", "world", "bb", "aaa"};
////			String[] str=strArray.split(",");
//		Map<String,Long> resultList=
//				Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//			    }
//		  }   
	
		  }
}
