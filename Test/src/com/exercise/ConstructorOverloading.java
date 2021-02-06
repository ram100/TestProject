package com.exercise;
//constructor overloading
public class ConstructorOverloading {
	int var1,var2,var3;
	ConstructorOverloading(int a){
		var1=a;
	}
	ConstructorOverloading(int x,int y){
		var2=x; var3=y;
	}
	
	public static void main(String args[]){
		
		ConstructorOverloading t1 = new ConstructorOverloading(10);
		System.out.println("the value of variable1:"+t1.var1);
		ConstructorOverloading t2 = new ConstructorOverloading(30,40);
		System.out.print("the value of variable2&3:"+t2.var2+"&"+t2.var3);
	}

}
