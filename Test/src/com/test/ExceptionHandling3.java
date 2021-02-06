package com.test;

public class ExceptionHandling3 {
	public static void main(String args[]){
		try{
			int i=Integer.parseInt(args[0]);
			System.out.println("inside try"+i);
		}
		catch(Exception e ){
			System.out.println("inside catch block"+e);
		}
		System.out.println("test");
		finally {}
	}

}
