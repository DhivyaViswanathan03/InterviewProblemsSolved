package com.divs;

public class Main implements IInterface1,IInterface2{
	
	

	public static void main(String[] args) {
		Main m=new Main();
		
//		int temp;
//		String str;
//		str="Foolish Day";
//		temp=str.indexOf("fool");
//		System.out.println(temp);
		m.m1();
//		IInterface1.demo();
	}
	


	public void display() {
		IInterface1.super.m1();
	}



	@Override
	public void m1() {
		// TODO Auto-generated method stub
		IInterface1.super.m1();
	}

}
