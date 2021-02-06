package com.exercise;

public class ExceptionHandling {
	void a()
	{
		try{			
			System.out.println("inside try  of method a");
			b();
		}
		catch(Exception e){
			System.out.println("inside catch of method a");
		}
		
	}
	void b() throws Exception{
		try {
			System.out.println("inside try  of method b");
		c();
		
		}
		catch(Exception e){
			System.out.println("inside catch of method b");
			throw new Exception();
		}
		finally{
			System.out.println("inside finally block of method b");
		}
	}
	void c()throws Exception{
		System.out.println("inside method c");
		throw new Exception();
	}
	
	public static void main(String args[]){
		ExceptionHandling exe = new ExceptionHandling();
		exe.a();
	}

}
