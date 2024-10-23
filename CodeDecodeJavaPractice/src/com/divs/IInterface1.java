package com.divs;

public interface IInterface1 {
	
	default void m1() {
		System.out.println("IInterface1.m1()");
	}
	static void demo() {
		System.out.println("IInterface1.demo()");
	}

}
