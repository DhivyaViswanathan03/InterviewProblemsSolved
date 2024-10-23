package com.divs.corejavainterview;

class A{
	
	public void display(){
		System.out.println("A.display()");
	}
	
}

class B extends A{
	public void display()throws ArithmeticException{
		System.out.println("B.display()");
	}
	
}

public class ExceptionHierarchy {

	public static void main(String[] args) {
		A obj=new B();
		obj.display();
		

	}

}
