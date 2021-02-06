package com.exercise;

public class StaticVariable {
	 static int var1 =300;
	 int  var2,var3;
	 StaticVariable(int x,int y){
		var2=x; var3=y; 
	 }
	public static void main(String args[]){
		StaticVariable sv = new StaticVariable(10,20);
		System.out.println("the static variable output:"+"var1:"+var1+"&var2:"+sv.var2 +"&Var3:"+sv.var3);
	}

}
