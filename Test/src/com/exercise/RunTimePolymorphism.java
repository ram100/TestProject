package com.exercise;

 class Base {
	
	 void meth(){
		System.out.println("inside the base class method");
	}
 }
 class Derived extends Base {
		
		 void meth(){
			System.out.println("inside the derived class method");
		}
	 }
	
	public class RunTimePolymorphism{
			public static void main(String args[]){
			Base bse = new Derived();
			bse.meth();
			
		}
	}


