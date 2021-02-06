package com.exercise;

public class ExceptionHandling1 {
	int var;
	ExceptionHandling1(int a){
		this.var=a;
		System.out.println("entering constructor");
	}
	
	public int meth(){
		var=var+10;
		System.out.println("entering method meth() and value of var is "+var);
		
		try{
			var=var+10;
			System.out.println("entering first try meth() and value of var is "+var);
			try{
				var=var *10;
				System.out.println("entering second try meth() and value of var is "+var);
				throw new Exception();
			}
			catch(Exception e){
				var=var-10;
				System.out.println("entering inner catch meth() and value of var is "+var);
			}
		}
		catch(Exception e){
			var=var-10;
			System.out.println("entering outer catch meth() and value of var is "+var);
		}
		return var;
	}
	public static void main(String args[]){
		ExceptionHandling1 exe = new ExceptionHandling1(10);
		int result=exe.meth();
		System.out.println("final result"+result);
	}
	

}
