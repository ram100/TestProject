package com.test;

 class a {
	 protected void meth(){
		 System.out.println("inside base  method");
		
	}

}

class b extends a {
	 void meth(){
		 System.out.println("inside override method");
		
	}
}
public class packaging extends b{
	public static void main(String args[]){
		packaging p = new packaging();
		p.meth();
	}
}
