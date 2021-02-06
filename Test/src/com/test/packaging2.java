package com.test;

 class aaaa {
	 protected void meth(){
		 System.out.println("inside base  method");
		
	}

}

class bbbb extends aaaa {
	 public void meth(){
		 System.out.println("inside override method");
		
	}
}
public class packaging2 extends bbbb{
	public static void main(String args[]){
		packaging p = new packaging();
		p.meth();
	}
}
