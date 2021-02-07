package com.test;

 class B {
	int x,y;
	int add(){
		int z=x+y;
		System.out.println("Z VALUE IS "+z);
		return z;
//testing merge
		
	}
}
	
	public class Overriding extends B {
		int x1,y1;
		int add(){
			int z1=x1+y1;
			System.out.println(z1);
			return z1;
			
		}
			public static void main(String args[]){
				B  b = new B();
				b.add();
				
			}
			
	}
		
	


