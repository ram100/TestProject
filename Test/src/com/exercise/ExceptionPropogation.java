package com.exercise;

public class ExceptionPropogation {
	int a=50;
	void meth(){
		int x=a/0;
	}
	void meth1(){
		meth();
	}
	void meth2(){
		try{
			meth1();
		}
		catch(Exception ex){
			System.out.println("exception handled");
		}
	}
	
	public static void main(String args[]){
		ExceptionPropogation exe = new ExceptionPropogation();
		exe.meth2();
		System.out.println("normal flow");
	}

}
