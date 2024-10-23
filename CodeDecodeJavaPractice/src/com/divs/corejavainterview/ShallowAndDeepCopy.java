package com.divs.corejavainterview;

class ABC{
	//instance variable
	int x=10;
}

public class ShallowAndDeepCopy {

	public static void main(String[] args) {
		
		
		//shallow copy
		/**
		 * 1.When we do a copy of some entity to create two or more than two entities such that 
		 * changes in one entity are reflected in the other entities as well, then we can say 
		 * we have done a shallow copy.
		 *2.new memory allocation never happens for the other entities, and the only reference
		 *  is copied to the other entities. 
		 */
		
		
		ABC obj1=new ABC();
		ABC obj2=obj1;
		
		obj2.x=20;
		
		System.out.println(obj1.x);
		
		//deep copy
		/**
		 * 1.When we do a copy of some entity to create two or more than two entities such that
		 *  changes in one entity are not reflected in the other entities, then we can say we 
		 *  have done a deep copy
		 * 2.a new memory allocation happens for the other entities, and reference is not copied
		 *  to the other entities
		 */
		
		ABC obj3=new ABC();
		ABC obj4=new ABC();
		
		obj4.x=20;
		
		System.out.println(obj3.x);
		
		/**
		 * Scenarios where deep and shallow copies are similar
		 * 1.Strings
		 * 2.Primitive Types
		 */
		//primitive types
		int a=10;
		int b=a;
		b=20;
		
		System.out.println(a);
		
		boolean flag1=true;
		boolean flag2=flag1;
		flag2=false;
		System.out.println(flag1);
		
		String s=new String("demo");
		String str=s;
		
		str="hello world";
		System.out.println(s);

	}

}
