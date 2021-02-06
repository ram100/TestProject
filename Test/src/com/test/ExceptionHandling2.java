package com.test;

import java.io.FileNotFoundException;

public class ExceptionHandling2 {
	
	static void meth()throws FileNotFoundException{
		System.out.println("inside method");
		throw new FileNotFoundException();
	
	}
	public static void main(String args[]){
		meth();
	}

}
