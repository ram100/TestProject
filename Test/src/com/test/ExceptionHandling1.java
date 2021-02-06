package com.test;

public class ExceptionHandling1 {
	public static void main(String args[]){
		try{
		int i=Integer.parseInt(args[0]);
		System.out.println("inside try"+i);
		}
		//System.out.println("after try block");
		catch(NumberFormatException e){
			System.out.println("catch"+e);
			
		}
		

}
}