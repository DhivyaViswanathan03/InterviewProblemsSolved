package com.divs.corejavainterview;

public class TryCatchReturnFlow {
	
	@SuppressWarnings("finally")
	public static int m1() {
		try{
//			int a=10/0;
			return 1;
		}catch(Exception e){
			return 2;
		}
		finally {
//			System.exit(0);
			return 3;
		}
	}

	public static void main(String[] args) {
		System.out.println(TryCatchReturnFlow.m1());
		
	}

}
